package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;


public class CloseGame implements ICommand
{

	@Override
	public int getType()
	{
		return Command.CLOSE_GAME;
	}
}
