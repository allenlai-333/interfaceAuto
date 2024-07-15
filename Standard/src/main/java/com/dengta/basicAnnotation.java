package com.dengta;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class basicAnnotation {


    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
    }
}
