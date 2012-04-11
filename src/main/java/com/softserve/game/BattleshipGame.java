package com.softserve.game;

import com.softserve.server.AbstractSocketThread;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: stvad
 * Date: 18.03.12
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class BattleshipGame extends Game {

    private static int BOARD_SIZE = 10;
    private static char HIT_CELL = 'h';
    private static char EMPTY_CELL = 0;
    private char[][] board1 = new char[BOARD_SIZE][BOARD_SIZE];
    private char[][] board2 = new char[BOARD_SIZE][BOARD_SIZE];
    private ArrayList<Ship> ships1;
    private ArrayList<Ship> ships2;

    public BattleshipGame(AbstractSocketThread firstPlayer, AbstractSocketThread secondPlayer) {
        super(firstPlayer, secondPlayer);
    }

    @Override
    protected void CheckForWin(Point moveCord) {

    }

    @Override
    protected void start() {

    }

    @Override
    public void Move(AbstractSocketThread sender, Point to) {
        if (board1[to.x][to.y] > 0) {

        }
    }

    public Ship getByCoords(char id) {
        for (Ship s : ships1) {
            if (s.getId() == id) {
                Ship sf = s;
                return sf;
            }
        }
        return null;
    }

    public void setLayout(ArrayList<Ship> ships, AbstractSocketThread player) {
        if (player.equals(firstPlayer)) {
            this.ships1 = ships;
        } else {
            this.ships2 = ships;
        }
    }

}
