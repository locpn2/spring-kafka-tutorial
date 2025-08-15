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
