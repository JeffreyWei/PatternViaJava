package com.jeffrey.pattern.observer.jdkimp;

import java.util.Observable;

/**
 * Created by wei on 15/5/2.
 */
public class Broadcastor extends Observable {
    public void setMessageAndNotify(String message) {
        this.setChanged();
        this.notifyObservers(message);
    }
}
