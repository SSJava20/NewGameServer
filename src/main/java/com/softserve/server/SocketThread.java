/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import com.softserve.commandoperator.CommandOperator;
import com.softserve.commandoperator.CommandOperatorFabric;
import com.softserve.command.Command;
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
    private CommandOperator operator;
    
    public SocketThread() {
        this.clientSocket = clientSocket;
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
                CommandOperatorFabric.getInstance(getStringCommand).operate();
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
    public void SendCommand(Command command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the playerThread
     */
    public Thread getPlayerThread() {
        return playerThread;
    }

    /**
     * @return the mediator
     */
    public ServerMediator getMediator() {
        return mediator;
    }

    /**
     * @param playerThread the playerThread to set
     */
    public void setPlayerThread(Thread playerThread) {
        this.playerThread = playerThread;
    }

    /**
     * @param mediator the mediator to set
     */
    public void setMediator(ServerMediator mediator) {
        this.mediator = mediator;
    }
}
