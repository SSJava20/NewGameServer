package com.softserve.command.game;

import com.softserve.command.Command;
import com.softserve.command.ICommand;


public class Move implements ICommand {
	private int row;
	private int col;

	public Move() {
	}

	public Move(int x, int y) {
		row = x;
		col = y;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	@Override
	public int getType() {
		return Command.MOVE;
	}
}