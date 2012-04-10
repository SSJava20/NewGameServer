package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;


public class GetPlayerList implements ICommand{
	
	public GetPlayerList() {
	}
    @Override
    public int getType() {
       return Command.GET_PLAYER_LIST;
    }
    
}