package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;


public class SendPlayerMark implements ICommand
{
	private char mark;
	public SendPlayerMark(char mark)
	{
		this.mark = mark;

	}

	@Override
	public int getType()
	{
		return Command.SEND_PLAYER_MARK;
	}

	public void setMark(char mark)
	{
		this.mark = mark;
	}

	/**
	 * @return player mark in lover case
	 */
	public char getMark()
	{
		if (mark == 'x' || mark == 'X') { return 'x'; }
		if (mark == 'o' || mark == 'O') { return 'o'; }
		return mark;
	}
}

