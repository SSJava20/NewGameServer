/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.softserve.command.Command;
import com.softserve.server.AbstractSocketThread;
import com.softserve.server.SocketThread;

/**
 *
 * @author Jeka
 * Class to operate the Server commands
 */
public class ServerCommandOperator extends CommandOperator{
    private Command cur;
    public ServerCommandOperator(Command command){
        
    }
    @Override
    public void operate(AbstractSocketThread thread) {
        switch (cur.getType()) {
        
        }
    }
    
}
