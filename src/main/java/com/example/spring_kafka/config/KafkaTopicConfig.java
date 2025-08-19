package com.example.spring_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic offsetTopic() {
        return TopicBuilder.name("offset-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic errorTopic() {
        return TopicBuilder.name("error-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic retryTopic() {
        return TopicBuilder.name("retry-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }
}
