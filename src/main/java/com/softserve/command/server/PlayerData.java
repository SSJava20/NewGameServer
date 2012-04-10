package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;

public class PlayerData implements ICommand
{
	private String name;

	public PlayerData(String name)
	{
		this.name = name;
	}

	@Override
	public int getType()
	{
		return Command.PLAYER_DATA;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}