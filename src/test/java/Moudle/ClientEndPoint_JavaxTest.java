package Moudle;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

class ClientEndPoint_JavaxTest {

    @Test
    void testConnect() {
        try {
            final ClientEndPoint_Javax clientEndPoint = new ClientEndPoint_Javax(new URI("ws://localhost:5050/websocket"));
            clientEndPoint.addMessageHandler(new ClientEndPoint_Javax.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
                }
            });
            clientEndPoint.sendMessage("Hello Server");
        } catch (URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
    }

}