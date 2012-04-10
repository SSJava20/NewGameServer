package com.softserve.command.server;

import com.softserve.command.Command;
import com.softserve.command.ICommand;

public class Accept implements ICommand {
	boolean acc;
	int acceptedplayerid;

	public int getAcceptedplayerid() {
		return acceptedplayerid;
	}

	public Accept() {
	}

	public Accept(boolean b, int acceptedplayerid) {
		this.acceptedplayerid = acceptedplayerid;
		acc = b;
	}

	public boolean isAcc() {
		return acc;
	}

	@Override
	public int getType() {
		return Command.ACCEPT;
	}


}
