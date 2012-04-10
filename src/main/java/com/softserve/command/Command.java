package com.softserve.command;
import com.google.gson.Gson;

public class Command {
    static public final int ACCEPT = 1;     
    static public final int MOVE = 2;
    static public final int REQUEST_GAME=3;
    static public final int SEND_PLAYER_LIST=4;
    static public final int GET_PLAYER_LIST=5;
    static public final int RESEND_REQUES_GAME=6;
    static public final int SEND_GAME_STATE=7;
    static public final int PLAYER_DATA = 8;
    static public final int SEND_PLAYER_MARK = 9;
    static public final int CLOSE_GAME = 10;
    static public final int SEND_SHIP_LAYOUT = 11;
    private String data;
    private int comandType;

    public Command( ICommand o) {
        comandType = o.getType();
        Gson gson = new Gson();
        data = gson.toJson(o);
    }

    public String getStringData() {
        return data;
    }

    static public Command deserialize(String s) {
        Gson gson = new Gson();
        Command com = gson.fromJson(s, Command.class);
        return com;
    }

    public String serialize() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public int getType() {
        return comandType;   
    }
}
