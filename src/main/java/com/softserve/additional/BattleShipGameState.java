package com.softserve.additional;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: stvad
 * Date: 10.04.12
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
class Ship
{}
public class BattleShipGameState extends GameState
{
    ArrayList<Ship> ships;

    public BattleShipGameState(char curPlayer, char WWon, boolean CErr, char[][] board)
    {
        super(curPlayer, WWon, CErr, board);
    }

    public BattleShipGameState(int row, int column)
    {
        super(row, column);
    }
}
