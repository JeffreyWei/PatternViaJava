package com.jeffrey.pattern.proxy.jdkrmi;

import java.rmi.Naming;
import java.rmi.Remote;

/**
 * Created by wei on 15/5/6.
 */
public class Server {

    public static void main(String[] args) {
        try {
            //both method
            Remote server = new ServerRemoteImpl();
            //ServerRemote server=new ServerRemoteImpl();
            //open local port
            java.rmi.registry.LocateRegistry.createRegistry(5099);
            Naming.rebind("//:5099/RemoteServer", server);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
