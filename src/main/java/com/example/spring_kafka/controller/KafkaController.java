package com.example.spring_kafka.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_kafka.service.KafkaProducerService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/publish")
    public String sendMessageToKafkaTopic(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage("my-topic", message);
        return "Message sent to Kafka topic successfully!";
    }
}
