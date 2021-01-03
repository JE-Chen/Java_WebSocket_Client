package Main;

import Moudle.javaWebSocketClient;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] argc) {
        try {
            javaWebSocketClient javaWebSocketClient = new javaWebSocketClient(new URI("ws://localhost:5555"));
            javaWebSocketClient.connect();
            javaWebSocketClient.send("test");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}



