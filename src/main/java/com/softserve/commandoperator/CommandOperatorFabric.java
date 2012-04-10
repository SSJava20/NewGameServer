/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.softserve.command.Command;

/**
 * 
 * @author Jeka
 */
public class CommandOperatorFabric {
	/**
	 * 
	 * @param command
	 * @return new Instance of CommandOperator,using the type of incoming
	 *         desirialized string command
	 */
	static public CommandOperator getInstance(String command) {
		Command curCommand = Command.deserialize(command);
		int type = curCommand.getType();
		if (type == Command.SEND_GAME_STATE || type == Command.MOVE
				|| type == Command.SEND_SHIP_LAYOUT) {
			return new GameCommandOperator(curCommand);
		} else {
			return new ServerCommandOperator(curCommand);
		}
	}
}
