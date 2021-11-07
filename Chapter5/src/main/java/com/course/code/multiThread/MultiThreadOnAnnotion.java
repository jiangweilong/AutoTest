package com.course.code.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 2,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
