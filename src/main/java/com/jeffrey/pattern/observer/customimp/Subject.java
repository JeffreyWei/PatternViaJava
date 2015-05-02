package com.jeffrey.pattern.observer.customimp;

/**
 * Created by wei on 15/5/2.
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObserver();
    public void setMessageAndNotify(String message);
}
