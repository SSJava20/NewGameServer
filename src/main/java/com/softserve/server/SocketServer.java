/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nubaseg
 */
public class SocketServer implements Runnable{

    private static int DEFAULT_PORT = 3224;
    private static String DEFAULT_IP = "127.0.0.1";
    private InetAddress ipAddress;
    private int port;
    private ServerSocket mServerSocket;
    private ServerMediator mediator;
    private Thread mthread;

    public SocketServer(InetAddress ipAddress, int port) throws IOException {
        this.ipAddress = ipAddress;
        this.port = port;
        mthread = new Thread(this);
        mthread.start();
    }

    public void run() {
         try {
            mServerSocket = new ServerSocket(port, 0, ipAddress);
            System.out.println("Running socketserver at " + ipAddress + ":" + port);
            while (true) {
                Socket nSocket = mServerSocket.accept();
                System.out.println("Client socket connected");
                mediator.getServerThreads().add(new SocketThread(nSocket, mediator));
            }
        } catch (IOException e) {
        } finally {
            try {
                mServerSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(SocketServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
