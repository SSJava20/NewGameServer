/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Nubaseg
 */
public class SocketThread extends AbstractSocketThread implements Runnable {

    private Thread playerThread;
    private Socket clientSocket;
    private ServerMediator mediator;
    private CommandOperator operator;
    
    public SocketThread(ServerMediator mediator) {
        this.clientSocket = clientSocket;
        this.mediator = mediator;
        playerThread = new Thread(this);
        playerThread.start();
    }

    public void run() {
        Scanner in = null;
        try {
            in = new Scanner(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e1) {
        }
        while (true) {
            String getStringCommand = "";
            try {
                getStringCommand = in.nextLine();
                System.out.println(getStringCommand);
                operator.operate(getStringCommand);
            } catch (Exception e) {
                try {
                    clientSocket.close();
                    // server.serverThreads.remove(this);
                } catch (IOException e1) {
                }
                break;
            }
            System.out.println(getStringCommand);
        }
        Thread.currentThread().interrupt();
    }

    @Override
    public void SendCommand(String command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
