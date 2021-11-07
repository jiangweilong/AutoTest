package com.course.code.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
     public void stu1(){
         System.out.println("GroupsOnClass2中stu1运行");
     }
    public void stu2(){
        System.out.println("GroupsOnClass2中stu2运行");
    }
    public void stu3(){
        System.out.println("GroupsOnClass2中stu3运行");
    }
}
