package com.example.spring_kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;

@Configuration
public class KafkaConfig {

    @Bean
    public ConsumerAwareListenerErrorHandler errorHandler() {
        return (message, exception, consumer) -> {
            System.err.println("Error handling: " + exception.getMessage());
            return null;
        };
    }

    @Bean
    public com.example.spring_kafka.config.CustomKafkaListenerErrorHandler retryHandler() {
        return new com.example.spring_kafka.config.CustomKafkaListenerErrorHandler();
    }
}
