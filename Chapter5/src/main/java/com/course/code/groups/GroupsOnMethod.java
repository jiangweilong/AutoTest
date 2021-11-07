package com.course.code.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4444");
    }
    @BeforeGroups("server")
    public void beforGroupOnServer(){
        System.out.println("这是服务端运行之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端运行之前的方法");
    }
    @BeforeGroups("clent")
    public void beforGroupOnClent(){
        System.out.println("这是客户务端运行之前的方法");
    }
    @AfterGroups("clent")
    public void afterGroupOnClent(){
        System.out.println("这是客户端运行之前的方法");
    }
}
