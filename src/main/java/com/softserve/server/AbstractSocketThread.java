/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import com.softserve.command.Command;

/**
 *
 * @author Nubaseg
 */
public abstract class AbstractSocketThread {

    private char mark;
    ServerMediator mediator;

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
}
