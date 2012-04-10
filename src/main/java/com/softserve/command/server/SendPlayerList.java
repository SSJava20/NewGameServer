package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.FreePlayer;
import com.softserve.command.ICommand;

public class SendPlayerList implements ICommand {

    FreePlayer[] players;

    public SendPlayerList(FreePlayer[] lst) {
        players = lst;
    }

    public FreePlayer[] getPlayers() {
        return players;
    }

    @Override
    public int getType() {
        return Command.SEND_PLAYER_LIST;
    }
}