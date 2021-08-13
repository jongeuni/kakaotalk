package com.dsm.kakaotalk.handler;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Log
@Component
public class WebSockChatHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        log.info("payload = "+ payload);
        TextMessage textMessage = new TextMessage(" welcome socket");
        session.sendMessage(textMessage);

    }
}
