package com.je_chen.WebSocket_Client.Main;

import com.je_chen.WebSocket_Client.Moudle.ClientEndPoint_Javax;
import com.je_chen.WebSocket_Client.Moudle.ClientEndPoint_org_java_websocket;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] argc) {
        /*
        ClientEndPoint_org_java_websocket Client = null;
        try {
            Client = new ClientEndPoint_org_java_websocket(new URI("ws://localhost:5050/websocket/websocket"));
            Client.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
         */

        try {
            // open websocket
            final ClientEndPoint_Javax clientEndPoint = new ClientEndPoint_Javax(new URI("ws://localhost:5050/websocket/websocket"));

            // add listener
            clientEndPoint.addMessageHandler(new ClientEndPoint_Javax.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
                }
            });

            // send message to websocket
            clientEndPoint.sendMessage("Hello Server");

            // wait 5 seconds for messages from websocket
            Thread.sleep(5000);

        } catch (URISyntaxException | InterruptedException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
    }
}

