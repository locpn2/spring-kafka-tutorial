package com.example.spring_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic offsetTopic() {
        return new NewTopic("offset-topic", 1, (short) 1);
    }

    @Bean
    public NewTopic errorTopic() {
        return new NewTopic("error-topic", 1, (short) 1);
    }

    @Bean
    public NewTopic retryTopic() {
        return new NewTopic("retry-topic", 1, (short) 1);
    }
}
