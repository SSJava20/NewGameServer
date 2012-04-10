/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.softserve.server.AbstractSocketThread;

/**
 *
 * @author Nubaseg
 */
public abstract  class CommandOperator {
    public abstract void operate(AbstractSocketThread thread);
}
