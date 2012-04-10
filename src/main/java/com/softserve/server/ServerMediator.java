/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import java.util.ArrayList;

/**
 *
 * @author Nubaseg
 */
public class ServerMediator {

    private ArrayList<SocketThread> socketThreads;

    public ServerMediator() {
        socketThreads = new ArrayList<SocketThread>();
    }

    public ArrayList<SocketThread> getServerThreads() {
        return socketThreads;
    }

//    public ArrayList<SocketThread> getFreeserverThreads() {
//    }
}
