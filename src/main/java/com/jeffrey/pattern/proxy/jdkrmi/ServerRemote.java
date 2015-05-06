package com.jeffrey.pattern.proxy.jdkrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wei on 15/5/6.
 */
public interface ServerRemote extends Remote {
    public String hello(String name) throws RemoteException;
}

