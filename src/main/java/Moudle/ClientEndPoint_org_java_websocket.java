package Moudle;


import java.net.URI;
import java.util.Map;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;

public class ClientEndPoint_org_java_websocket extends WebSocketClient{

    public ClientEndPoint_org_java_websocket(URI ServerUri, Draft draft) {
        super(ServerUri, draft);
    }

    public ClientEndPoint_org_java_websocket(URI ServerUri) {
        super(ServerUri);
    }

    public ClientEndPoint_org_java_websocket(URI ServerUri, Map<String, String> HttpHeaders) {
        super(ServerUri, HttpHeaders);
    }


    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        send("Hello Server");
        System.out.println("Connect");
    }

    @Override
    public void onMessage(String Message) {
        System.out.println("Received Message : "+ Message);
    }

    @Override
    public void onClose(int code, String Reason, boolean Remote) {
        System.out.println("Connection closed by " + (Remote ? "remote peer" : "us") + " Code: " + code + " Reason: " + Reason);
    }

    @Override
    public void onError(Exception e) {

    }
}
