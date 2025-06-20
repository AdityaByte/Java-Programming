package com.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// If you don't want to create the topic explicitly by the CLI command.
// In that case, spring boot provides a way by which you can create a topic by the
// configuration class.

@Configuration
public class KafkaProducerConfig {

    @Bean
    public NewTopic createTopic() {
        return new NewTopic("aditya1", 3, (short) 1);
    }
}
