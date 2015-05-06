package com.jeffrey.pattern.proxy.jdkrmi;

import java.rmi.Naming;

/**
 * Created by wei on 15/5/6.
 */
public class Client {
    public static void main(String[] args) {
        try {
            ServerRemote serverRemote = (ServerRemote) Naming.lookup("rmi://127.0.0.1:5099/RemoteServer");
            System.out.println(serverRemote.hello("bibeng"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
