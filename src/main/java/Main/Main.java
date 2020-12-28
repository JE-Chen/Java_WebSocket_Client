package Main;

import Moudle.ClientEndPoint_org_java_websocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] argc) {


        ClientEndPoint_org_java_websocket Client = null;
        try {
            Client = new ClientEndPoint_org_java_websocket(new URI("ws://localhost:5050/websocket/websocket"));
            Client.connect();
            String command;
            do {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                command = reader.readLine();
                Client.send(command);
            } while (!command.equals("exit"));
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

    }
}

