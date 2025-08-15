package com.example.spring_kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received Message in group my-group-id: " + message);
    }
}
