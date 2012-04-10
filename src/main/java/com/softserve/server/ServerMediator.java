/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import com.softserve.command.FreePlayer;
import java.util.ArrayList;

/**
 *
 * @author Nubaseg
 */
public class ServerMediator {

    private ArrayList<AbstractSocketThread> socketThreads;

    public ServerMediator() {
        socketThreads = new ArrayList<AbstractSocketThread>();
    }

    public ArrayList<AbstractSocketThread> getServerThreads() {
        return socketThreads;
    }

    public ArrayList<FreePlayer> getFreePlayerList() {
        ArrayList<FreePlayer> freeList = new ArrayList<FreePlayer>();
        for(int i = 0; i<socketThreads.size(); i++)
        {
            if(socketThreads.get(i).getMyGame() == null)
                freeList.add(new FreePlayer(i, socketThreads.get(i).getName()));
        }
        return freeList;
    }

}
