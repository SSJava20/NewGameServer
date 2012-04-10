/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import com.softserve.command.Command;
import com.softserve.game.Game;

/**
 *
 * @author Nubaseg
 */
public abstract class AbstractSocketThread {

    private char mark;
    ServerMediator mediator;
    private Game myGame;
    private String Name;

    public AbstractSocketThread() {
        myGame = null;
    }
    
    

    public abstract void SendCommand(Command command);

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
}
