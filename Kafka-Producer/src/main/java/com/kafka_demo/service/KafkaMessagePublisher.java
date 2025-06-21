package com.kafka_demo.service;

import com.kafka_demo.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    Logger log = LoggerFactory.getLogger(KafkaMessagePublisher.class);

    public void sendMessageToTopic(String message) {
        // The return type of the send method is the Completable future (asynchronous method).
        // So if you want to block the main thread till the message is being sent in that case.
        // You can do the future.get().
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("aditya", message);
        // future.get() // If we do this this will slow down the producer.
        // Since kafka is a fast messaging platform, so it's better to handle messages asynchronously.
        // So that the subsequent message didn't wait for the result of the previous messages.
        // We can do this with the help of a callback implementation.
        future.whenComplete((result, exception) -> {
            if (exception == null) {
                log.info("Sent Message=[{}] with offset=[{}] and with Partition=[{}]", message, result.getRecordMetadata().offset(), result.getRecordMetadata().partition());
            } else {
                log.error("Unable to send message=[{}] due to: [{}]", message, exception.getMessage());
            }
        });
    }

    // For sending the object you need to explicit set the key-serializer and the value-serializer.
    // Same in the consumer you need to tell the same key-deserializer and value-deserializer.
    public void sendEventToTopic(Customer customer) {
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send("aditya-object", customer);
        future.whenComplete((result, exception) -> {
            if (exception != null) {
                log.info("Sent Object: {} with offset=[{}]", customer.toString(), result.getRecordMetadata().offset());
            } else {
                log.error("Unable to send message=[{}] due to: [{}]", customer.toString(), exception.getMessage());
            }
        });

    }

}
