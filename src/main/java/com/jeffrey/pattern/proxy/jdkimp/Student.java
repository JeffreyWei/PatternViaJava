package com.jeffrey.pattern.proxy.jdkimp;

/**
 * Created by wei on 15/5/5.
 */
public class Student implements Person {
    @Override
    public void say() {
        System.out.println("Student say Hello!");
    }
}
