package com.course.code.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void  beforSuit(){
        System.out.println("befor suite 运行啦");
    }
    @AfterSuite
    public  void afterSuit(){
        System.out.println("after suite 运行啦");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("beforTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

}
