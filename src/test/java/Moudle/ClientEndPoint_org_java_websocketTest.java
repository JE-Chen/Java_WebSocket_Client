package Moudle;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

class ClientEndPoint_org_java_websocketTest {

    @Test
    void testConnect(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ClientEndPoint_org_java_websocket Client = null;
                try {
                    Client = new ClientEndPoint_org_java_websocket(new URI("ws://localhost:5050/websocket"));
                    Client.connect();
                    Thread.sleep(5000);
                    Client.close();
                } catch (URISyntaxException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }
}