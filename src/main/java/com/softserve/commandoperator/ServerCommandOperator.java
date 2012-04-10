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
import com.softserve.server.AbstractSocketThread;
import com.softserve.server.SocketThread;
import java.awt.Point;

/**
 *
 * @author Jeka Class to operate the Server commands
 */
public class ServerCommandOperator extends CommandOperator {

    private Command cur;

    public ServerCommandOperator(Command command) {
        cur = command;
    }

    @Override
    public void operate(AbstractSocketThread thread) {
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
}
