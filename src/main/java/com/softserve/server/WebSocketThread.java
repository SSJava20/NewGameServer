/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.server;

import com.softserve.command.Command;
import com.softserve.commandoperator.CommandOperatorFabric;
import java.io.IOException;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.websocket.WebSocket;

/**
 *
 * @author Nubaseg
 */
public class WebSocketThread extends AbstractSocketThread implements WebSocket, WebSocket.OnFrame, WebSocket.OnBinaryMessage, WebSocket.OnTextMessage, WebSocket.OnControl {

    protected FrameConnection connection;
    private WebSocketServer server;
    //private WSCommandProcessor processor;

    public WebSocketThread(WebSocketServer server) {
        this.server = server;
//        processor = new WSCommandProcessor(this);
    }

    public FrameConnection getConnection() {
        return connection;
    }

    @Override
    public void onOpen(Connection connection) {
        System.out.printf("%s#onOpen %s\n", this.getClass().getSimpleName(), connection);
    }

    @Override
    public void onHandshake(FrameConnection connection) {
        System.out.printf("%s#onHandshake %s %s\n", this.getClass().getSimpleName(), connection, connection.getClass().getSimpleName());
        this.connection = connection;
        server.getWSClients().add(this);
    }

    @Override
    public void onClose(int code, String message) {
        System.out.printf("%s#onDisonnect %d %s\n", this.getClass().getSimpleName(), code, message);
        server.getWSClients().remove(this);
    }

    @Override
    public boolean onFrame(byte flags, byte opcode, byte[] data, int offset, int length) {
        System.out.printf("%s#onFrame %s|%s %s\n", this.getClass().getSimpleName(), TypeUtil.toHexString(flags), TypeUtil.toHexString(opcode), TypeUtil.toHexString(data, offset, length));
        return false;
    }

    @Override
    public boolean onControl(byte controlCode, byte[] data, int offset, int length) {
        System.out.printf("%s#onControl %s %s\n", this.getClass().getSimpleName(), TypeUtil.toHexString(controlCode), TypeUtil.toHexString(data, offset, length));
        return false;
    }

    public void sendCommand(String commandString) throws IOException {
        connection.sendMessage(commandString);
    }

    @Override
    public void onMessage(String data) {
        System.out.printf("%s#onMessage %s\n", this.getClass().getSimpleName(), data);
        CommandOperatorFabric.getInstance(data).operate();
    }

    @Override
    public void onMessage(byte[] data, int offset, int length) {
        System.out.printf("%s#onMessage     %s\n", this.getClass().getSimpleName(), TypeUtil.toHexString(data, offset, length));
    }

    @Override
    public void SendCommand(Command command) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
