package main.java.com.mariobacellar;

import java.net.URI;
import java.util.Scanner;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class MyWebSocketClient extends WebSocketClient {
    public MyWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("Connected to " + getURI());
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Received message: " + message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Disconnected!");
    }

    @Override
    public void onError(Exception ex) {
        System.out.println("Error occurred: " + ex.getMessage());
    }

    public static void main(String[] args) {
        URI serverUri = URI.create("ws://localhost:8080/websocket");
        MyWebSocketClient client = new MyWebSocketClient(serverUri);
        client.connect();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            client.send(message);
        }
    }
}
