package com.jeffrey.pattern.observer.jdkimp;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wei on 15/5/2.
 */
public class Women implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Women got a message:"+o.toString());
    }
}
