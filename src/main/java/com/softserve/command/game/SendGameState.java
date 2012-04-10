package com.softserve.command.game;

import com.softserve.additional.GameState;
import com.softserve.command.Command;
import com.softserve.command.ICommand;

public class SendGameState implements ICommand{
    private GameState state;
    public SendGameState(GameState a){
        state=a;
    }
    public GameState getGameState(){
        return state;
    }

    @Override
    public int getType() {
        return Command.SEND_GAME_STATE;
    }
}