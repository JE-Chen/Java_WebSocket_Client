package Moudle;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

class ClientEndPoint_org_java_websocketTest {

    @Test
    void testConnect(){
        ClientEndPoint_org_java_websocket Client = null;
        try {
            Client = new ClientEndPoint_org_java_websocket(new URI("ws://192.168.100.150:5050/websocket"));
            Client.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}