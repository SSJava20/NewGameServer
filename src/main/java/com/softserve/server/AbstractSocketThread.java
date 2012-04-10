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
    
    public abstract void SendCommand(Command command);
    
}
