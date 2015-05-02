package com.jeffrey.pattern.observer.jdkimp;

import java.util.Observer;

/**
 * Created by wei on 15/5/2.
 */
public class Client {
    public static void main (String [] args) {
        Broadcastor broadcastor=new Broadcastor();
        Observer man=new Man();
        Observer women=new Women();
        broadcastor.addObserver(man);
        broadcastor.addObserver(women);
        broadcastor.setMessageAndNotify("today is sunday!");
    }
}
