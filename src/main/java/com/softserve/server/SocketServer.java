/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Nubaseg
 */
public class SocketServer {

    private static int DEFAULT_PORT = 3224;
    private static String DEFAULT_IP = "127.0.0.1";
    private InetAddress ipAddress;
    private int port;
    private ArrayList<SocketThread> socketThreads;
    private ServerSocket mServerSocket;
    private ServerMediator mediator;

    public SocketServer(InetAddress ipAddress, int port) throws IOException {
        this.ipAddress = ipAddress;
        this.port = port;
        mediator = new ServerMediator();
        socketThreads = new ArrayList<SocketThread>();
        try {
            mServerSocket = new ServerSocket(port, 0, ipAddress);
            System.out.println(" " + ipAddress + ":" + port);
            while (true) {
                Socket nSocket = mServerSocket.accept();
                System.out.println("");
                // serverThreads.add(new ServerThread(this, nSocket));
            }
        } catch (IOException e) {
        } finally {
            mServerSocket.close();
        }

    }
}
