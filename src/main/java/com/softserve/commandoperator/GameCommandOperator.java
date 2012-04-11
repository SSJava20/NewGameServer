/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.google.gson.Gson;
import com.softserve.command.Command;
import com.softserve.command.game.Move;
import com.softserve.command.game.SendGameState;
import com.softserve.command.game.SendShipLayout;
import com.softserve.command.server.SendPlayerMark;
import com.softserve.server.AbstractSocketThread;
import com.softserve.server.SocketThread;

/**
 *
 * @author Jeka Class to operate the Game commands
 */
public class GameCommandOperator extends CommandOperator {

    private Command cur;

    public GameCommandOperator(Command command) {
        cur = command;
    }

    @Override
    public void operate(AbstractSocketThread thread) {
        Gson gson = new Gson();
        switch (cur.getType()) {
            case Command.MOVE: {
                Move move = gson.fromJson(cur.getStringData(), Move.class);
                thread.getCommandSender().sendMove(move);
                break;
            }
            case Command.SEND_GAME_STATE: {
                SendGameState sgs = gson.fromJson(cur.getStringData(), SendGameState.class);
                thread.getCommandSender().sendGameState(sgs.getGameState());
                break;
            }
            case Command.SEND_PLAYER_MARK: {
                SendPlayerMark sMark = gson.fromJson(cur.getStringData(), SendPlayerMark.class);
                thread.getCommandSender().SendPlayerMark();
                break;
            }
            case Command.SEND_SHIP_LAYOUT: {
                SendShipLayout layout = gson.fromJson(cur.getStringData(), SendShipLayout.class);
                thread.getCommandSender().sendShipLayout(layout.getLayout());
                break;
            }
            default: {
            }
        }

    }
}
