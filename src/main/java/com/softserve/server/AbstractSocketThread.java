/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import com.softserve.command.Command;
import com.softserve.commandoperator.CommandSender;
import com.softserve.game.Game;

/**
 *
 * @author Nubaseg
 */
public abstract class AbstractSocketThread {

    protected char mark;
    protected ServerMediator mediator;
    protected CommandSender commandSender;
    protected Game myGame;
    protected String Name;

    public AbstractSocketThread() {
        myGame = null;
    }
    
    

    public abstract void sendCommand(String command);

    /**
     * @return the mark
     */
    public char getMark() {
        return mark;
    }
    
    /**
     * @param mark the mark to set
     */
    public void setMark(char mark) {
        this.mark = mark;
    }

    /**
     * @return the myGame
     */
    public Game getMyGame() {
        return myGame;
    }

    /**
     * @param myGame the myGame to set
     */
    public void setMyGame(Game myGame) {
        this.myGame = myGame;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the mediator
     */
    public ServerMediator getMediator() {
        return mediator;
    }

    /**
     * @return the commandSender
     */
    public CommandSender getCommandSender() {
        return commandSender;
    }

    /**
     * @param mediator the mediator to set
     */
    public void setMediator(ServerMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * @param commandSender the commandSender to set
     */
    public void setCommandSender(CommandSender commandSender) {
        this.commandSender = commandSender;
    }
}
