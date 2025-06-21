package com.kafka_demo.controller;

import com.kafka_demo.dto.Customer;
import com.kafka_demo.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher messagePublisher;

    @GetMapping("/publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable String message) {
        try {
            messagePublisher.sendMessageToTopic(message);
            return ResponseEntity
                    .ok("Message published successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @GetMapping("/publish-overload")
    public ResponseEntity<?> publishOverloadMessages(@RequestParam("message") String message) {
        try {
            // The message will go to which partition is totally handled by the coordinator or the
            // zookeeper that how the kafka handle the load.
            for (int i=0; i<10000; i++) {
                messagePublisher.sendMessageToTopic(message + "-" + i);
            }
            return ResponseEntity.ok("Overloaded Message published successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }

    @PostMapping
    public ResponseEntity<?> publishObject(@RequestBody Customer customer) {
        try {
            messagePublisher.sendEventToTopic(customer);
            return ResponseEntity.ok("Object sent successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
 }
