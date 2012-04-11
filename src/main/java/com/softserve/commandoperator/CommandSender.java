/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.softserve.additional.GameState;
import com.softserve.command.Command;
import com.softserve.command.FreePlayer;
import com.softserve.command.game.SendGameState;
import com.softserve.command.server.SendPlayerList;
import com.softserve.server.AbstractSocketThread;

/**
 *
 * @author Nubaseg
 */
public class CommandSender {

    AbstractSocketThread ownerThread;

    public CommandSender(AbstractSocketThread ownerThread) {
        this.ownerThread = ownerThread;
    }

    public void sendGameState(GameState state) {
        Command command = new Command(new SendGameState(state));
        ownerThread.sendCommand(command.serialize());
    }

    public void SendPlayerMark() {
    }

    public void SendPlayerList() {
        FreePlayer[] a = new FreePlayer[ownerThread.getMediator().getFreePlayerList().size()];
        ownerThread.getMediator().getFreePlayerList().toArray(a);
        Command command = new Command(new SendPlayerList(a));
        ownerThread.sendCommand(command.serialize());
    }

    public void SendAccept() {
    }

    public void SendRequestGame() {
    }

    public void SendCloseGame() {
    }
}
