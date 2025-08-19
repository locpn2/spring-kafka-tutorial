# Spring Kafka Tutorial

This project is created to provide an overview of Apache Kafka, the benefits of using Kafka, and how to integrate Kafka with Spring Boot.

## Objectives of this session:

1.  **Install Apache Kafka via Docker Compose and Confluent Platform:**
    *   Use `docker-compose.yml` to start Zookeeper, Kafka Broker, and Kafka UI.
    *   Run the command: `docker-compose up -d`
    *   Access Kafka UI at: `http://localhost:8082` (or the port you configured)

2.  **Configure Kafka in the Spring Boot project:**
    *   The file `src/main/resources/application.properties` has been configured:
        ```properties
        spring.kafka.bootstrap-servers=localhost:9092
        spring.kafka.consumer.group-id=my-group-id
        ```
    *   The file `src/main/java/com/example/spring_kafka/config/KafkaTopicConfig.java` has been created to define the `my-topic` topic.

3.  **Create Kafka Producer and Consumer:**
    *   `src/main/java/com/example/spring_kafka/service/KafkaProducerService.java`: Service to send messages.
    *   `src/main/java/com/example/spring_kafka/service/KafkaConsumerService.java`: Service to listen for messages.

4.  **Send messages to the Kafka topic:**
    *   `src/main/java/com/example/spring_kafka/controller/KafkaController.java`: REST Controller with the `/kafka/publish` endpoint.
    *   To send a message, use the curl command (after the Spring Boot application has started):
        ```bash
        curl -X POST "http://localhost:8080/kafka/publish?message=Hello%20Kafka%20from%20Spring%20Boot!"
        ```
        (Remember to change the port if your Spring Boot application is running on a different port)

        To send a message, use the following curl command:
        ```bash
        curl -X POST "http://localhost:8080/kafka/publish?message=YourMessage"
        ```
        (Replace `YourMessage` with the message you want to send)

    *   The file `src/main/resources/application.properties` has been configured with serializers:
        ```properties
        spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
        spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
        ```

5.  **Configure Kafka Consumer:**
    *   The file `src/main/resources/application.properties` has been configured with deserializers:
        ```properties
        spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
        spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
        ```

## Instructions for running the project:

1.  **Start Kafka using Docker Compose:**
    ```bash
    docker-compose up -d
    ```
2.  **Start the Spring Boot application:**
    ```bash
    mvn spring-boot:run
    ```
3.  **Send messages and verify:**
    *   Use the curl command above to send a message.
    *   Check the Spring Boot application logs to see the message being received by the consumer.
    *   Access Kafka UI (`http://localhost:8082`) to check the topic and messages.

## Next sessions:

In the following sessions, we will delve into each aspect of Kafka and how to optimize the use of Kafka in Spring Boot projects.

## Implemented Demos (Auto-commit)

### Offset Management (Auto-commit)

- Configured `enable.auto.commit=true` and `auto.commit.interval.ms` in `application.properties`:

```properties
spring.kafka.consumer.enable-auto-commit=true
spring.kafka.consumer.auto-commit-interval=1000
```

- Implemented a `@KafkaListener` to consume messages:

```java
@KafkaListener(topics = "offset-topic", groupId = "auto-commit-group")
public void autoCommitListener(String message) {
    System.out.println("Auto-commit listener received: " + message);
}
```

### ConsumerAwareListenerErrorHandler

- Implemented a `ConsumerAwareListenerErrorHandler` bean in `KafkaConfig.java`:

```java
@Bean
public ConsumerAwareListenerErrorHandler errorHandler() {
    return (message, exception, consumer) -> {
        System.err.println("Error handling: " + exception.getMessage());
        return null;
    };
}
```

- Implemented a `@KafkaListener` that uses the error handler in `KafkaConsumerService.java`:

```java
@KafkaListener(topics = "error-topic", groupId = "error-group", errorHandler = "errorHandler")
public void errorListener(String message) {
    if (message.contains("error")) {
        throw new RuntimeException("Simulated error");
    }
    System.out.println("Received: " + message);
}
```

### SeekToCurrentErrorHandler

- Implemented a `SeekToCurrentErrorHandler` bean in `KafkaConfig.java`:

```java
@Bean
public SeekToCurrentErrorHandler retryHandler() {
    SeekToCurrentErrorHandler handler = new SeekToCurrentErrorHandler();
    handler.setMaxAttempts(3);
    return handler;
}
```

- Implemented a `@KafkaListener` that uses the retry handler in `KafkaConsumerService.java`:

```java
@KafkaListener(topics = "retry-topic", groupId = "retry-group", errorHandler = "retryHandler")
public void retryListener(String message) {
    if (message.contains("error")) {
        throw new RuntimeException("Simulated error");
    }
    System.out.println("Received: " + message);
}
```

## Implemented Demos (Manual commit)

### Offset Management (Manual commit)

- Configured `enable.auto.commit=false` in `application.properties`:

```properties
spring.kafka.consumer.enable-auto-commit=false
```

- Implemented a `@KafkaListener` that uses `Acknowledgment.acknowledge()` to commit offsets:

```java
import org.springframework.kafka.support.Acknowledgment;

@KafkaListener(topics = "offset-topic", groupId = "manual-commit-group")
public void manualCommitListener(String message, Acknowledgment acknowledgment) {
    System.out.println("Manual-commit listener received: " + message);
    acknowledgment.acknowledge();
}
```

### ConsumerAwareListenerErrorHandler

- Implemented a `ConsumerAwareListenerErrorHandler` bean in `KafkaConfig.java`:

```java
@Bean
public ConsumerAwareListenerErrorHandler errorHandler() {
    return (message, exception, consumer) -> {
        System.err.println("Error handling: " + exception.getMessage());
        return null;
    };
}
```

- Implemented a `@KafkaListener` that uses the error handler in `KafkaConsumerService.java`:

```java
@KafkaListener(topics = "error-topic", groupId = "manual-error-group", errorHandler = "errorHandler")
public void errorListener(String message) {
    if (message.contains("error")) {
        throw new RuntimeException("Simulated error");
    }
    System.out.println("Received: " + message);
}
```

### SeekToCurrentErrorHandler

- Implemented a `SeekToCurrentErrorHandler` bean in `KafkaConfig.java`:

```java
@Bean
public SeekToCurrentErrorHandler retryHandler() {
    SeekToCurrentErrorHandler handler = new SeekToCurrentErrorHandler();
    handler.setMaxAttempts(3);
    return handler;
}
```

- Implemented a `@KafkaListener` that uses the retry handler in `KafkaConsumerService.java`:

```java
@KafkaListener(topics = "retry-topic", groupId = "manual-retry-group", errorHandler = "retryHandler")
public void retryListener(String message) {
    if (message.contains("error")) {
        throw new RuntimeException("Simulated error");
    }
    System.out.println("Received: " + message);
}
