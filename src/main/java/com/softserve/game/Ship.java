package com.softserve.game;

/**
 * Created by IntelliJ IDEA.
 * User: Awake
 * Date: 11.04.12
 * Time: 0:06
 * To change this template use File | Settings | File Templates.
 */
public class Ship {
    private static char id_counter = 'a';
    private char id;
    private int size;
    private int health;
    private int x;
    private int y;
    private int dx;
    private int dy;

    public Ship(int x, int y, int dx, int dy) {
        this.x = (x < dx) ? x : dx;
        this.y = (y < dy) ? y : dy;
        this.dx = (dx < x) ? x : dx;
        this.dy = (dy < y) ? y : dy;
        this.size = Math.abs(x + y - dx - dy);
        this.health = this.size;
        this.id = id_counter;
        id_counter++;
    }

    public void hit() {
        health--;
    }

    public char getId() {
        return id;
    }

    public boolean isDestroyed() {
        boolean destroyed = (health == 0);
        return destroyed;
    }

    public void paintToBoard(char[][] board) {
        for (int i = x; i <= dx; i++) {
            for (int j = y; j <= dy; j++) {
                board[i][j] = this.id;
            }
        }

    }
}
