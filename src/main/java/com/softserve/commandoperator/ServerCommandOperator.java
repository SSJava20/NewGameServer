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
                //requestNewGametoThread(requestgame.getCurId());

                break;
            }
            case Command.ACCEPT: {
                Accept accept = gson.fromJson(cur.getStringData(), Accept.class);
                //acceptGame(server.getServerThreadById(accept.getAcceptedplayerid()));
                break;
            }

            case Command.GET_PLAYER_LIST: {
                //sendPlayerList();
                break;
            }
            case Command.PLAYER_DATA: {
                PlayerData pdata = gson.fromJson(cur.getStringData(),
                        PlayerData.class);
                //this.setName(pdata.getName());
                break;
            }
            case Command.CLOSE_GAME: {
                //closeGame();
                break;
            }
            case Command.SEND_PLAYER_MARK: {
                //sendPlayerMark();
                break;
            }
            default: {
            }
        }
    }

    private void requestNewGame(int id) {
        Command command = new Command(new ResendRequestGame(id));
        curThread.sendCommand(command.serialize());
    }

    private void requestNewGametoThread(int id) {
        ArrayList<AbstractSocketThread> list=curThread.getMediator().getServerThreads();
        //ServerThread opponentServerThread = server.getServerThreadById(id);
        //opponentServerThread.requestNewGame(server.serverThreads.indexOf(this));
    }

}
