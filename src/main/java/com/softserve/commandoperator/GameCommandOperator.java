/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.softserve.command.Command;
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
        switch (cur.getType()) {
            case Command.MOVE: {

                break;
            }
            case Command.SEND_GAME_STATE: {

                break;
            }
            default: {
            }
        }

    }
}