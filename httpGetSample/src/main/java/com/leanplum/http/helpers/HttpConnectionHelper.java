package com.leanplum.http.helpers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HttpConnectionHelper {

    private Map<String, String> cookies;

    public HttpConnectionHelper() {
    }

    /**
     * @return the cookies
     */
    public Map<String, String> getCookies() {
        return cookies;
    }

    /**
     * @param cookies
     *            the cookies to set
     */
    public void setCookies(Map<String, String> cookies) {
        this.cookies = cookies;
    }

    public HttpResponse httpPut(String url, Map<String, String> headers, Map<String, String> parameters, byte[] data)
            throws Exception {
        return doHttp("PUT", url, headers, parameters, data);
    }

    public HttpResponse httpPost(String url, Map<String, String> headers, Map<String, String> parameters, byte[] data)
            throws Exception {
        return doHttp("POST", url, headers, parameters, data);
    }

    public HttpResponse httpDelete(String url, Map<String, String> headers, Map<String, String> parameters)
            throws Exception {
        return doHttp("DELETE", url, headers, parameters, null);
    }

    public HttpResponse httpGet(String url, Map<String, String> headers, Map<String, String> parameters)
            throws Exception {
        return doHttp("GET", url, headers, parameters, null);
    }

    /**
     * @param type
     *            http operation: get post put delete
     * @param url
     *            to work on
     * @param queryString
     * @param data
     *            to write, if a writable operation
     * @param headers
     *            to use in the request
     * @param cookies
     *            to use in the request and update from the response
     * @return http response
     * @throws Exception
     */
    private HttpResponse doHttp(String type, String url, Map<String, String> headers, Map<String, String> parameters,
            byte[] data) throws Exception {

        URL newUrl = null;
        try {
            newUrl = new URL(url);

            HttpURLConnection con = (HttpURLConnection) newUrl.openConnection();
            con.setRequestMethod(type);

            String cookieString = getCookieString();
            prepareHttpRequest(con, headers, parameters, data, cookieString);

            con.connect();
            HttpResponse ret = retrieveHtmlResponse(con);
            return ret;
        } catch (MalformedURLException e) {
            return null;
        }
    }

    /**
     * @param con
     *            connection to set the headers and bytes in
     * @param headers
     *            to use in the request, such as content-type
     * @param bytes
     *            the actual data to post in the connection.
     * @param cookieString
     *            the cookies data from clientside, such as lwsso, qcsession, jsession etc.
     * @throws java.io.IOException
     */
    private void prepareHttpRequest(HttpURLConnection con, Map<String, String> headers, Map<String, String> parameters,
            byte[] bytes, String cookieString) throws IOException {

        // attach cookie information if such exists
        if ((cookieString != null) && !cookieString.isEmpty()) {

            con.setRequestProperty("Cookie", cookieString);
        }

        // send data from headers
        if (headers != null) {
            Iterator<Entry<String, String>> headersIterator = headers.entrySet().iterator();
            while (headersIterator.hasNext()) {

                Entry<String, String> header = headersIterator.next();
                con.setRequestProperty(header.getKey(), header.getValue());
            }
        }

        //handle the parameters here
        if ((parameters != null) && (parameters.size() > 0)) {

            con.setDoOutput(true);

            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(getParamsString(parameters));
            out.flush();
            out.close();
        }

        // If there's data to attach to the request, it's handled here.
        if ((bytes != null) && (bytes.length > 0)) {

            con.setDoOutput(true);

            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.write(bytes);
            out.flush();
            out.close();
        }
    }

    /**
     * @param con
     *            that is already connected to its url with an http request, and that should contain a response for us
     *            to retrieve
     * @return a response from the server to the previously submitted http request
     * @throws Exception
     */
    private HttpResponse retrieveHtmlResponse(HttpURLConnection con) throws Exception {

        HttpResponse ret = new HttpResponse();

        int responseCode = con.getResponseCode();
        ret.setStatusCode(responseCode);
        ret.setResponseHeaders(con.getHeaderFields());

        InputStream inputStream;
        // select the source of the input bytes, first try 'regular' input
        try {
            inputStream = con.getInputStream();
        }

        /*
         * If the connection to the server somehow failed, for example 404 or 500, con.getInputStream() will throw an
         * exception, which we'll keep. We'll also store the body of the exception page, in the response data.
         */
        catch (Exception e) {

            inputStream = con.getErrorStream();
            ret.setFailure(e);
        }

        StringBuilder resultData = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line; // reading the lines into the result
        while ((line = rd.readLine()) != null) {
            resultData.append(line);
        }
        rd.close();

        ret.setResponseData(resultData.toString());

        return ret;
    }

    public String getCookieString() {

        StringBuilder sb = new StringBuilder();

        if (cookies != null && !cookies.isEmpty()) {

            Set<Entry<String, String>> cookieEntries = cookies.entrySet();
            for (Entry<String, String> entry : cookieEntries) {
                sb.append(entry.getKey()).append("=").append(entry.getValue()).append(";");
            }
        }

        String ret = sb.toString();
        return ret;
    }

    public String getParamsString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();
        return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) : resultString;
    }

}
