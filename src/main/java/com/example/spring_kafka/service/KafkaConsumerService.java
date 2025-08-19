package com.example.spring_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "offset-topic", groupId = "auto-commit-group")
    public void autoCommitListener(String message) {
        System.out.println("Auto-commit listener received: " + message);
    }

    @KafkaListener(topics = "error-topic", groupId = "error-group", errorHandler = "errorHandler")
    public void errorListener(String message) {
        if (message.contains("error")) {
            throw new RuntimeException("Simulated error");
        }
        System.out.println("Received: " + message);
    }

    @KafkaListener(topics = "retry-topic", groupId = "retry-group", errorHandler = "retryHandler")
    public void retryListener(String message) {
        if (message.contains("error")) {
            throw new RuntimeException("Simulated error");
        }
        System.out.println("Received: " + message);
    }
}
