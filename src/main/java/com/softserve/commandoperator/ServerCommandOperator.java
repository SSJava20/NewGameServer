/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.google.gson.Gson;
import com.softserve.command.Command;
import com.softserve.command.server.Accept;
import com.softserve.command.server.PlayerData;
import com.softserve.command.server.RequestGame;
import com.softserve.command.server.ResendRequestGame;
import com.softserve.server.AbstractSocketThread;
import com.softserve.server.SocketThread;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Jeka Class to operate the Server commands
 */
public class ServerCommandOperator extends CommandOperator {

    private Command cur;
    private AbstractSocketThread curThread;

    public ServerCommandOperator(Command command) {
        cur = command;
    }

    @Override
    public void operate(AbstractSocketThread thread) {
        curThread=thread;
        Gson gson = new Gson();
        switch (cur.getType()) {
            case Command.REQUEST_GAME: {
                RequestGame requestgame = gson.fromJson(cur.getStringData(),
                        RequestGame.class);
                thread.getCommandSender().SendRequestGame();
                break;
            }
            case Command.ACCEPT: {
                Accept accept = gson.fromJson(cur.getStringData(), Accept.class);
                thread.getCommandSender().SendAccept();
                break;
            }

            case Command.GET_PLAYER_LIST: {
                thread.getCommandSender().SendPlayerList();
                break;
            }
            case Command.PLAYER_DATA: {
                PlayerData pdata = gson.fromJson(cur.getStringData(),
                        PlayerData.class);
                thread.setName(pdata.getName());
                break;
            }
            case Command.CLOSE_GAME: {
                thread.getCommandSender().SendCloseGame();
                break;
            }
            default: {
            }
        }
    }
}
