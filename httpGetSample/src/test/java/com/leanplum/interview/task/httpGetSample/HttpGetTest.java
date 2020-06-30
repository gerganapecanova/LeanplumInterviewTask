package com.leanplum.interview.task.httpGetSample;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.leanplum.http.helpers.HttpConnectionHelper;
import com.leanplum.http.helpers.HttpResponse;
import com.leanplum.http.json.objects.SampleResponse;

public class HttpGetTest {
    public static final String LEANPLUM_API_URL = "https://api.leanplum.com/api";
    public static final String DOWNLOAD_DIR = "\\Download";
    public static final String NOT_DOWNLOADABLE_FILE_NAME = "missing.png";

    @Test
    public void httpGetTest() {
        try {

            HttpConnectionHelper httpConnectionHelper = new HttpConnectionHelper();
            String fileName = null;

            while (fileName == null || fileName.equals(NOT_DOWNLOADABLE_FILE_NAME)) {
                Map<String, String> parameters = new HashMap<String, String>();
                parameters.put("action", "getVars");
                parameters.put("appId", "app_RubheMIalgqgrQFE4CFHfym9TdfTz33yBoPKFB5QfJM");
                parameters.put("clientKey", "dev_7gCY7tENQpM2F5hWOSCeb1vrtbKzr2uDINUXQOMPDNc");
                parameters.put("userId", "588e43ef7fc6fb75");
                parameters.put("apiVersion", "1.0.6");

                HttpResponse getResponse = httpConnectionHelper.httpGet(LEANPLUM_API_URL, null, parameters);

                Assert.assertTrue(getResponse.isResponseOk(), "Failed to get the responce.");

                System.out.println("Response status code: " + getResponse.getStatusCode());
                System.out.println("Response: " + getResponse.getResponseData());

                Gson gson = new Gson();

                SampleResponse sampleResponse = gson.fromJson(getResponse.getResponseData(), SampleResponse.class);

                fileName = sampleResponse.getResponse().get(0).getVars().getFileName();
                Double fileSize = sampleResponse.getResponse().get(0).getVars().getFileSizeBytes();
                System.out.println("File name is: " + fileName);
                System.out.println("File size is: " + fileSize);

                Assert.assertTrue(fileName != null && !fileName.isEmpty() && fileSize > 0,
                        "Failed to parse the response.");
            }

            Map<String, String> dowloadFileParameters = new HashMap<String, String>();
            dowloadFileParameters.put("action", "downloadFile");
            dowloadFileParameters.put("appId", "app_RubheMIalgqgrQFE4CFHfym9TdfTz33yBoPKFB5QfJM");
            dowloadFileParameters.put("clientKey", "dev_7gCY7tENQpM2F5hWOSCeb1vrtbKzr2uDINUXQOMPDNc");
            dowloadFileParameters.put("apiVersion", "1.0.6");
            dowloadFileParameters.put("filename", fileName);

            String fileDir = new File("").getAbsolutePath() + DOWNLOAD_DIR;

            String downloadedFile = httpConnectionHelper.httpGet(LEANPLUM_API_URL, null, dowloadFileParameters, fileDir,
                    fileName);

            System.out.println("The file is downloaded at: " + downloadedFile);
            Assert.assertNotNull(downloadedFile);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
