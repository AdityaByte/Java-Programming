package com.kafka_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessageToTopic(String message) {
        // The return type of the send method is the Completable future (asynchronous method).
        // So if you want to block the main thread till the message is being sent in that case.
        // You can do the future.get().
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("aditya1", message);
        // future.get() // If we do this this will slow down the producer.
        // Since kafka is a fast messaging platform, so it's better to handle messages asynchronously.
        // So that the subsequent message didn't wait for the result of the previous messages.
        // We can do this with the help of a callback implementation.
        future.whenComplete((result, exception) -> {
            if (exception == null) {
                System.out.println("Sent Message= [" + message + "] with offset=[" + result.getRecordMetadata().offset() + "] and with Partition=[" + result.getRecordMetadata().partition() + "]");
            } else {
                System.out.println("Unable to send message["+ message + "] due to: [" + exception.getMessage() + "]");
            }
        });

    }

}
