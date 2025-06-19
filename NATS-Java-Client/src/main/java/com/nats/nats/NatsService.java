package com.nats.nats;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nats.model.ChatMessage;
import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class NatsService {

    @Autowired
    private Connection connection;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public Dispatcher createDispatcher() {
        Dispatcher dispatcher = connection.createDispatcher(msg -> {
            try {
                String json = new String(msg.getData(), StandardCharsets.UTF_8);
                ChatMessage message = objectMapper.readValue(json, ChatMessage.class);
                System.out.println("Recieved from NATS-> ");
                System.out.println(message.getRoomId());
                System.out.println(message.getSender());
                System.out.println(message.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return dispatcher;
    }

    public void subscribeTo(Dispatcher dispatcher, String subject) {
        dispatcher.subscribe(subject);
        System.out.printf("Successfully subscribe message to %s\n", subject);
    }

    public void publishTo(String subject, ChatMessage chatMessage) throws IOException {
        String json = objectMapper.writeValueAsString(chatMessage);
        connection.publish(subject, json.getBytes(StandardCharsets.UTF_8));
        System.out.printf("Successfully publish message to %s\n", subject);
    }

}
