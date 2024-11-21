package com.rh.websocketdemo.model;

import com.rh.websocketdemo.enums.MessageType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

// TODO: find a way to persist these messages
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String id;
    private String sender;
    private String receiver;
    // TODO: make a separate message class
    private MessageType type;
    private String message;
}
