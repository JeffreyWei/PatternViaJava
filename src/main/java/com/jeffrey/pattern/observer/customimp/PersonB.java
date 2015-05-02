package com.jeffrey.pattern.observer.customimp;

/**
 * Created by wei on 15/5/2.
 */
public class PersonB implements Observer{
    @Override
    public void update(String message) {
        System.out.println("this is B ,got message is "+message);

    }
}
