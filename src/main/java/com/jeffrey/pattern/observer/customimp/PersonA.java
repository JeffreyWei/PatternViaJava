package com.jeffrey.pattern.observer.customimp;

/**
 * Created by wei on 15/5/2.
 */
public class PersonA implements Observer {
    @Override
    public void update(String message) {
        System.out.println("this is A ,got message is "+message);
    }
}
