package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;

public class RequestGame implements ICommand {
	int curId;

	public RequestGame() {
	}

	public RequestGame(int id) {
		curId = id;
	}

	public int getCurId() {
		return curId;
	}

	@Override
	public int getType() {
		return Command.REQUEST_GAME;
	}

}