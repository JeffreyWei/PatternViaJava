package com.jeffrey.pattern.proxy.jdkrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wei on 15/5/6.
 */
public class ServerRemoteImpl extends UnicastRemoteObject implements ServerRemote {
    public ServerRemoteImpl() throws RemoteException {
    }

    @Override
    public String hello(String name) throws RemoteException{
        String message=name+" hello!";
        System.out.println(message);
        return message;
    }
}
