package Main;

import Moudle.ClientEndPoint_Javax;
import Moudle.ClientEndPoint_org_java_websocket;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] argc) {

        ClientEndPoint_org_java_websocket Client = null;
        try {
            Client = new ClientEndPoint_org_java_websocket(new URI("ws://192.168.100.150:5050/websocket"));
            Client.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


        /*
        try {
            // open websocket
            final ClientEndPoint_Javax clientEndPoint = new ClientEndPoint_Javax(new URI("ws://localhost:5050/websocket"));

            // add listener
            clientEndPoint.addMessageHandler(new ClientEndPoint_Javax.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
                }
            });

            // send message to websocket
            clientEndPoint.sendMessage("Hello Server");

        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
        */
    }
}

