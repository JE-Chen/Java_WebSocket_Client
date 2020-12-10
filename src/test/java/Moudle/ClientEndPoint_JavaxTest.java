package Moudle;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

class ClientEndPoint_JavaxTest {

    @Test
    void testConnect() {
        Runnable testRun = new Runnable() {
            @Override
            public void run() {
                try {
                    final ClientEndPoint_Javax clientEndPoint = new ClientEndPoint_Javax(new URI("ws://localhost:5050/websocket"));
                    clientEndPoint.addMessageHandler(new ClientEndPoint_Javax.MessageHandler() {
                        public void handleMessage(String message) {
                            System.out.println(message);
                        }
                    });
                    clientEndPoint.sendMessage("Hello Server");
                    Thread.sleep(5000);
                    clientEndPoint.close();
                        URISyntaxException ex) {
                    System.err.println("URISyntaxException exception: " + ex.getMessage());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread testThread = new Thread(testRun);
        testThread.setDaemon(true);
        testThread.start();
        try {
            Thread.sleep(5000);
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}