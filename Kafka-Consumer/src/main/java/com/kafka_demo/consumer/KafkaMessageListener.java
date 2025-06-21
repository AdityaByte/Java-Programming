package com.kafka_demo.consumer;

import com.kafka_demo.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "aditya", groupId = "group-1")
    public void consumer1(String message) {
        log.info("[consumer1] Consumed message: {}", message);
    }

    // Note: In the upper case I had tested the consumer with only one partition likely i am publishing the message to only
    // one partition and the only consumer is listening to them.
    // But in the next example we will create a consumer group having the same group Id and the
    // zookeeper and coordinator will assign the partition to each consumer.

    // Example: we have a topic which has 3 partitions and we have 4 consumers.
    // we are producing large set of data so the coordinator assigned individual consumers
    // for consuming the data.
    // Let use see how many data is being added in a particular partition and how the consumer is consumed it.

    @KafkaListener(topics = "aditya", groupId = "group-1")
    public void consumer2(String message) {
        log.info("[consumer2] Consumed message: {}", message);
    }

    @KafkaListener(topics = "aditya", groupId = "group-1")
    public void consumer3(String message) {
        log.info("[consumer3] Consumed message: {}", message);
    }

    @KafkaListener(topics = "aditya", groupId = "group-1")
    public void consumer4(String message) {
        log.info("[consumer4] Consumed message: {}", message);
    }

    // Here creating another listener which listens for another topic.
    // topic : aditya-object
    // So creating a topic which listens for the object.
    @KafkaListener(topics = "aditya-object", groupId = "group-1")
    public void objectConsumer(Customer customer) {
        log.info("Consumed object: {}", customer.toString());
    }
}
