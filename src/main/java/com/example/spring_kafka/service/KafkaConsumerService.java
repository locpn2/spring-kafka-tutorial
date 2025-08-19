package com.example.spring_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
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

    @KafkaListener(topics = "offset-topic", groupId = "manual-commit-group")
    public void manualCommitListener(String message, Acknowledgment acknowledgment) {
        System.out.println("Manual-commit listener received: " + message);
        acknowledgment.acknowledge();
    }

    @KafkaListener(topics = "error-topic", groupId = "manual-error-group", errorHandler = "errorHandler")
    public void manualErrorListener(String message) {
        if (message.contains("error")) {
            throw new RuntimeException("Simulated error");
        }
        System.out.println("Received: " + message);
    }

    @KafkaListener(topics = "retry-topic", groupId = "manual-retry-group", errorHandler = "retryHandler")
    public void manualRetryListener(String message) {
        if (message.contains("error")) {
            throw new RuntimeException("Simulated error");
        }
        System.out.println("Received: " + message);
    }
}
