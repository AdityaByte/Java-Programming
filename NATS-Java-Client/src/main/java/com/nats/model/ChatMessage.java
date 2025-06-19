package com.nats.model;

public class ChatMessage {
    private String sender;
    private String text;
    private String roomId;

    public String getRoomId() {
        return roomId;
    }

    public String getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setText(String text) {
        this.text = text;
    }
}

