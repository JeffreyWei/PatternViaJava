package com.jeffrey.pattern.observer.customimp;

import java.util.Date;

/**
 * Created by wei on 15/5/2.
 */
public class Client {
    public static void main(String [] args) {
        Subject subject = new PaperPress();
        Observer personA = new PersonA();
        Observer personB = new PersonB();
        subject.addObserver(personA);
        subject.addObserver(personB);
        subject.setMessageAndNotify("time is" + new Date());
        System.out.println("====================");
        subject.removeObserver(personA);
        subject.setMessageAndNotify("this is another message");
    }
}
