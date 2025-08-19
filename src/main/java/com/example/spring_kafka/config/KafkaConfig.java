package com.example.spring_kafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.ConsumerAwareListenerErrorHandler;
import org.springframework.kafka.listener.SeekToCurrentErrorHandler;

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
    public SeekToCurrentErrorHandler retryHandler() {
        SeekToCurrentErrorHandler handler = new SeekToCurrentErrorHandler();
        handler.setMaxAttempts(3);
        return handler;
    }
}
