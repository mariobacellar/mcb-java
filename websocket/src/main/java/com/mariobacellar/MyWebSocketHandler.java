package main.java.com.mariobacellar;

import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;

public class MyWebSocketHandler implements WebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("Connected!");
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        if (message instanceof TextMessage) {
            String payload = ((TextMessage) message).getText();
            System.out.println("Received message: " + payload);
            session.sendMessage(new TextMessage("Echo: " + payload));
        } else if (message instanceof BinaryMessage) {
            // Handle binary messages
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("Error occurred: " + exception.getMessage());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("Disconnected!");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
