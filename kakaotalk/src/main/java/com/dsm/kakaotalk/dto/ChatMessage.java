package com.dsm.kakaotalk.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    public enum MessageType{
        ENTER, TALK
    }
    private MessageType type;
    private String roomId; // 방번호
    private String sender; // 메시지 보낸사람
    private String message;
}
