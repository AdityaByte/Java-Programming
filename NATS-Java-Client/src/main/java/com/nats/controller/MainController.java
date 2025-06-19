package com.nats.controller;

import com.nats.model.ChatMessage;
import com.nats.nats.NatsService;
import io.nats.client.Dispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private NatsService natsService;

    @PostMapping
    public void sendMessage(@RequestBody ChatMessage chatMessage) {
        try{
            String subject = "chat.msg";
            Dispatcher dispatcher = natsService.createDispatcher();
            // Firstly we have to listen to the endpoint after that the publisher will publish the message otherwise the message will be lost.
            natsService.subscribeTo(dispatcher, subject);
            natsService.publishTo(subject, chatMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
