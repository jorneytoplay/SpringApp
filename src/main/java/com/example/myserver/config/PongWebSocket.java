package com.example.myserver.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
public class PongWebSocket extends TextWebSocketHandler {

    //Когда соединение совершилось при помощи session.sendMessage отправим сообщение
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        session.sendMessage(new TextMessage("connection established"));
    }


    //Обработка получаемых сообщений
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        log.info(message.getPayload());
        session.sendMessage(new TextMessage("Pong"));

    }
}
