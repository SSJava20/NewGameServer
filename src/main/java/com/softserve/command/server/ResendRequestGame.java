package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;

public class ResendRequestGame implements ICommand {
	private int reqID;

	public ResendRequestGame() {
	}

	public ResendRequestGame(int id) {
		reqID = id;
	}

	public int getReqID() {
		return reqID;
	}

	@Override
	public int getType() {
		return Command.RESEND_REQUES_GAME;
	}

}