package com.leanplum.http.helpers;

import java.util.Map;

public class HttpResponse {
    private static final int OK_STATUS_CODE = 200;
    private Map<String, ? extends Iterable<String>> responseHeaders = null;
    protected String responseData = null;
    private Exception failure = null;
    private int statusCode = 0;

    /**
     * @param responseHeaders
     * @param responseData
     * @param failure
     */
    public HttpResponse(Map<String, Iterable<String>> responseHeaders, String responseData, Exception failure,
            int statusCode) {
        super();
        this.responseHeaders = responseHeaders;
        this.responseData = responseData;
        this.failure = failure;
        this.statusCode = statusCode;
    }

    public HttpResponse() {
    }

    /**
     * @return the response Headers
     */
    public Map<String, ? extends Iterable<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * @param responseHeaders
     *            the responseHeaders to set
     */
    public void setResponseHeaders(Map<String, ? extends Iterable<String>> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    /**
     * @return the response Data
     */
    public String getResponseData() {
        return responseData;
    }

    /**
     * @param responseData
     *            the responseData to set
     */
    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    /**
     * @return the failure if the access to the requested URL failed, such as a 404 or 500 If no failure occurred, this
     *         method returns null.
     */
    public Exception getFailure() {
        return failure;
    }

    /**
     * @param failure
     *            the failure to set
     */
    public void setFailure(Exception failure) {
        this.failure = failure;
    }

    /**
     * @return the statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode
     *            the statusCode to set
     */
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isResponseOk() {
        return this.statusCode == OK_STATUS_CODE;
    }

    /**
     * @see java.lang.Object#toString() return the contents of the byte[] data as a string.
     */
    @Override
    public String toString() {
        return new String(this.responseData);
    }
}
