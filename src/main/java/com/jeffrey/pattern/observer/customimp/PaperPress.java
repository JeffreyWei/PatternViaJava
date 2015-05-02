package com.jeffrey.pattern.observer.customimp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 15/5/2.
 */
public class PaperPress implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : this.observerList) {
            observer.update(this.message);
        }
    }

    @Override
    public void setMessageAndNotify(String message) {
        this.message = message;
        this.notifyAllObserver();
    }
}
