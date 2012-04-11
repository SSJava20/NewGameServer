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
        fillWater(board1);
        fillWater(board2);
    }

    @Override
    protected void CheckForWin(Point moveCord) {

    }

    @Override
    protected void start() {

    }

    @Override
    public void Move(AbstractSocketThread sender, Point to) {
        if (sender.equals(firstPlayer)) {
            char id = board2[to.x][to.y];
            if (id > 0) {
                Ship s = getById(id, ships2);
                s.hit();
            }
        }
    }

    public Ship getById(char id, ArrayList<Ship> ships) {
        for (Ship s : ships) {
            if (s.getId() == id) {
                Ship sf = s;
                return sf;
            }
        }
        return null;
    }

    public void fillWater(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    public void fillShips(ArrayList<Ship> ships, char[][] board) {
        for (Ship s : ships) {
            s.paintToBoard(board);
        }
    }

    public void setLayout(ArrayList<Ship> ships, AbstractSocketThread player) {
        if (player.equals(firstPlayer)) {
            this.ships1 = ships;
            fillShips(ships, board1);
        } else {
            this.ships2 = ships;
            fillShips(ships, board2);
        }
    }

}
