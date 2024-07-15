package com.dengta.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("before suite运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行了");
    }
}
