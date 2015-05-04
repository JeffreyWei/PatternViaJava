package com.jeffrey.pattern.adapter;

/**
 * Created by wei on 15/5/4.
 */
public class Goat implements  Sheep {
    @Override
    public void eat() {
        System.out.println("grass");
    }
}
