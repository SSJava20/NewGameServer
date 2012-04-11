/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.command.game;

import com.softserve.command.Command;
import com.softserve.command.ICommand;
import com.softserve.game.Ship;
import java.util.ArrayList;

/**
 *
 * @author Jeka
 */
public class SendShipLayout implements ICommand{
    private ArrayList<Ship> shipLayout;
    
    public SendShipLayout(ArrayList<Ship> layout){
        shipLayout=layout;
    }
    public ArrayList<Ship> getLayout(){
        return shipLayout;
    }

    @Override
    public int getType() {
        return Command.SEND_SHIP_LAYOUT;
    }
}
