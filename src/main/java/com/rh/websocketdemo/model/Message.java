package com.rh.websocketdemo.model;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private UUID senderId;
    private UUID receiverId;
    private String message;
}
