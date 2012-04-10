/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.gameserver;

import com.softserve.server.SocketServer;
import com.softserve.server.WebSocketServer;
import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nubaseg
 */
public class GameServer {

    private static int DEFAULT_PORT = 3224;
    private static String DEFAULT_IP = "127.0.0.1";

    public static void main(String[] args) {
        int port = DEFAULT_PORT;
        String ip = DEFAULT_IP;
        if (args.length > 1) {
            port = Integer.parseInt(args[1]);
            ip = args[0];
        }
        try {
            new SocketServer(InetAddress.getByName(ip), port);
        } catch (IOException ex) {
            Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        new WebSocketServer(8080);

    }
}
