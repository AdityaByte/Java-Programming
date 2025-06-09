package com.socket.dto;

public class ChatUserDTO {
    private String username;
    private String role;
    private String status;

    public String getUsername() {
        return username;
    }

    public String getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "ChatUserDTO{" +
                "username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
