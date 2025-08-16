# Progress: Spring Kafka Tutorial

## What works

-   **Kafka setup:** Kafka cluster is running using Docker Compose.
-   **Spring Boot integration:** Spring Boot application is configured to connect to Kafka.
-   **Producer and Consumer:** Basic producer and consumer are implemented and can send and receive messages.
-   **REST API:** REST endpoint `/kafka/publish` is working and can be used to send messages to Kafka.
-   **Kafka UI:** Kafka UI is accessible and can be used to monitor the Kafka cluster.
-   **Memory Bank:** Basic memory bank files are created and populated.

## What's left to build

-   **Error handling and retry mechanisms:** Implement robust error handling and retry mechanisms for both producer and consumer.
-   **Kafka Streams and Kafka Connect:** Explore Kafka Streams for stream processing and Kafka Connect for integrating with other data sources.
-   **Security:** Implement security configurations for Kafka.
-   **Performance optimization:** Optimize Kafka performance by tuning various configuration parameters.
-   **Avro/Schema Registry:** Integrate Avro and Schema Registry for schema evolution and data serialization.
-   **Unit tests:** Write unit tests for the producer and consumer.

## Current status

-   **Completed:** Basic Kafka setup and integration with Spring Boot.
-   **In progress:** Setting up Memory Bank.
-   **Pending:** Implementing advanced features and optimizations.

## Known issues

-   **Error handling:** Error handling is not yet implemented.
-   **Security:** Security configurations are not yet implemented.
-   **Performance:** Performance is not yet optimized.

## Evolution of project decisions

-   **Docker Compose:** Decided to use Docker Compose for easy setup and management of the Kafka cluster.
-   **Spring Kafka:** Decided to use Spring Kafka for simplified Kafka integration within the Spring Boot application.
-   **Kafka UI:** Decided to use Kafka UI for monitoring and managing Kafka topics and messages.
-   **Port 8080 conflict:** Resolved the port conflict by changing the port of Kafka UI to 8082.

## Todo

- [x] Cấu hình `application.properties`
- [x] Tạo `KafkaProducerService`
- [x] Tạo `KafkaController`
- [x] Kiểm tra cấu hình
