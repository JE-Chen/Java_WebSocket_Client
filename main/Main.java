package com.je_chen.socket_client.main;

import com.je_chen.socket_client.Client.SocketClient;

public class Main {

    public static void main(String[] args){

        for(int i=0;i<=100;i++){
            new Thread(new SocketClient("Socket"+Integer.toString(i),"127.0.0.1",5555)).start();
        }
    }
}
