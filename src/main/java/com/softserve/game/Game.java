package com.softserve.game;

import com.softserve.server.AbstractSocketThread;
import com.softserve.additional.GameState;

import java.awt.*;

public abstract class Game
{
    protected AbstractSocketThread firstPlayer;
    protected AbstractSocketThread secondPlayer;
    protected GameState State;

    protected abstract void CheckForWin(Point moveCord);
    protected abstract void start();
    public abstract void Move(AbstractSocketThread sender, Point from, Point to);

    public GameState getState()
    {
        return State;
    }

    public void setState(GameState state)
    {
        State = state;
    }

    public Game(AbstractSocketThread firstPlayer, AbstractSocketThread secondPlayer)
    {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;

        start();
        SendStates();
    }

    protected char reverseChar(char toRev)
    {
        if(toRev == 'x')
            return '0';
        if(toRev =='0')
            return 'x';

        return 0;
    }

    protected void SendStates()
    {
//        firstPlayer.sendGameState(State);
//        secondPlayer.sendGameState(State);
        //TODO: sending game states
    }

    public void Surrender(AbstractSocketThread sender)
    {
        State.setWhoWon(reverseChar(sender.getMark()));
        SendStates();
    }
}