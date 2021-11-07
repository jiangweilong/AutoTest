package com.course.code;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记维测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @BeforeTest
    public void beforeMetd(){
        System.out.println("这是在测试方法运行之前运行的");
    }
    @Test
    public  void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @AfterTest
    public void   affterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforevlass这是在类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("beforevlass这是在类之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试到套件");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

}
