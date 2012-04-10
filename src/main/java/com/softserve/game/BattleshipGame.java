package com.softserve.game;

import com.softserve.server.AbstractSocketThread;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: stvad
 * Date: 18.03.12
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class BattleshipGame extends Game
{
    public BattleshipGame(AbstractSocketThread firstPlayer, AbstractSocketThread secondPlayer)
    {
        super(firstPlayer, secondPlayer);
    }

    @Override
    protected void CheckForWin(Point moveCord)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void start()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void Move(AbstractSocketThread sender, Point from, Point to)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
