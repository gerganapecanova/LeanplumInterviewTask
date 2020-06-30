package com.leanplum.http.base;

import org.testng.annotations.BeforeTest;

import com.leanplum.http.helpers.HttpConnectionHelper;

public class BaseTest {

    protected HttpConnectionHelper httpConnectionHelper;

    @BeforeTest(alwaysRun = true)
    public void beforeClass() {
        httpConnectionHelper = new HttpConnectionHelper();
    }

}
