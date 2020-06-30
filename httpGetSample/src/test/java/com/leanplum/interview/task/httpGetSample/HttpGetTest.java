package com.leanplum.interview.task.httpGetSample;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.leanplum.http.base.BaseTest;
import com.leanplum.http.helpers.HttpResponse;
import com.leanplum.http.json.objects.SampleResponse;

public class HttpGetTest extends BaseTest {
    private static final String LEANPLUM_API_URL = "https://api.leanplum.com/api";
    private static final String DOWNLOAD_DIR = "\\Download";
    private static final String NOT_DOWNLOADABLE_FILE_NAME = "missing.png";
    // max number of retries 
    private static final int MAX_RETRIES = 100;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void httpGetTest() throws IOException {
        String fileName = null;
        Double fileSize = null;

        // get appropriate file name and size
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("action", "getVars");
        parameters.put("appId", "app_RubheMIalgqgrQFE4CFHfym9TdfTz33yBoPKFB5QfJM");
        parameters.put("clientKey", "dev_7gCY7tENQpM2F5hWOSCeb1vrtbKzr2uDINUXQOMPDNc");
        parameters.put("userId", "588e43ef7fc6fb75");
        parameters.put("apiVersion", "1.0.6");

        int iter = 0;
        while ((fileName == null || fileName.equals(NOT_DOWNLOADABLE_FILE_NAME)) && iter < MAX_RETRIES) {
            HttpResponse getResponse = httpConnectionHelper.httpGet(LEANPLUM_API_URL, null, parameters);

            Assert.assertTrue(getResponse.isResponseOk(), "Failed to get the responce.");

            log.debug("Response status code: " + getResponse.getStatusCode());
            log.debug("Response: " + getResponse.getResponseData());

            Gson gson = new Gson();

            SampleResponse sampleResponse = gson.fromJson(getResponse.getResponseData(), SampleResponse.class);

            fileName = sampleResponse.getResponse().get(0).getVars().getFileName();
            fileSize = sampleResponse.getResponse().get(0).getVars().getFileSizeBytes();
            log.debug("File name is: " + fileName);
            log.debug("File size is: " + fileSize);

            Assert.assertTrue(fileName != null && !fileName.isEmpty() && fileSize > 0, "Failed to parse the response.");
            iter++;
        }

        // download the file
        Map<String, String> dowloadFileParameters = new HashMap<String, String>();
        dowloadFileParameters.put("action", "downloadFile");
        dowloadFileParameters.put("appId", "app_RubheMIalgqgrQFE4CFHfym9TdfTz33yBoPKFB5QfJM");
        dowloadFileParameters.put("clientKey", "dev_7gCY7tENQpM2F5hWOSCeb1vrtbKzr2uDINUXQOMPDNc");
        dowloadFileParameters.put("apiVersion", "1.0.6");
        dowloadFileParameters.put("filename", fileName);

        String fileDir = new File("").getAbsolutePath() + DOWNLOAD_DIR;

        String downloadedFileName = httpConnectionHelper.httpGet(LEANPLUM_API_URL, null, dowloadFileParameters, fileDir,
                fileName);

        log.info("The file is downloaded at: " + downloadedFileName);
        Assert.assertNotNull(downloadedFileName);

        // gets the size of downladed file
        File downloadedFile = new File(downloadedFileName);
        long downloadedFileSize = downloadedFile.length();

        log.debug("downloadedFileSize:" + downloadedFileSize);

        // compare both sizes
        BigDecimal expected = new BigDecimal(fileSize);
        BigDecimal actual = new BigDecimal(downloadedFileSize);

        if (expected.compareTo(actual) != 0) {
            log.error("Downloaded file size is not as expected! (Expected: " + expected.toString() + "; Actual: "
                    + actual.toString() + ")");
            throw new AssertionError("Downloaded file size is not as expected! (Expected: " + expected.toString()
                    + "; Actual: " + actual.toString() + ")");
        }

    }

}
