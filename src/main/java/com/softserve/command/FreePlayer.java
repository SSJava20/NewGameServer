package com.softserve.command;

public class FreePlayer {

    private int id;
    private String Name;

    public FreePlayer(int id, String name) {
        this.id = id;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
