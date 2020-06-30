package com.leanplum.interview.task.httpGetSample;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.leanplum.http.helpers.HttpConnectionHelper;
import com.leanplum.http.helpers.HttpResponse;

public class HttpGetTest {
    public static final String LEANPLUM_API_URL = "https://api.leanplum.com/api";

    @Test
    public void httpGetTest() {
        try {
            HttpConnectionHelper httpConnectionHelper = new HttpConnectionHelper();

            Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("action", "getVars");
            parameters.put("appId", "app_RubheMIalgqgrQFE4CFHfym9TdfTz33yBoPKFB5QfJM");
            parameters.put("clientKey", "dev_7gCY7tENQpM2F5hWOSCeb1vrtbKzr2uDINUXQOMPDNc");
            parameters.put("userId", "588e43ef7fc6fb75");
            parameters.put("apiVersion", "1.0.6");

            HttpResponse getResponse = httpConnectionHelper.httpGet(LEANPLUM_API_URL, null, parameters);

            Assert.assertTrue(getResponse.isResponseOk());

            System.out.println("Response status code: " + getResponse.getStatusCode());

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
