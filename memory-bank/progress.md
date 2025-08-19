# Progress: Spring Kafka Tutorial

## What works

-   **Kafka setup:** Kafka cluster is running using Docker Compose.
-   **Spring Boot integration:** Spring Boot application is configured to connect to Kafka.
-   **Producer and Consumer:** Basic producer and consumer are implemented and can send and receive messages.
-   **REST API:** REST endpoint `/kafka/publish` is working and can be used to send messages to Kafka.
-   **Kafka UI:** Kafka UI is accessible and can be used to monitor the Kafka cluster.
-   **Memory Bank:** Basic memory bank files are created and populated.
-   **Offset and Group ID Management:** Explained and configured offset and group ID management in Spring Boot.
-   **Auto-commit implementation:** Implemented auto-commit strategy for offset management.
-   **ConsumerAwareListenerErrorHandler:** Implemented `ConsumerAwareListenerErrorHandler` for handling exceptions.
-   **SeekToCurrentErrorHandler:** Implemented `SeekToCurrentErrorHandler` for retrying failed messages.
-   **Manual commit implementation:** Implemented manual commit strategy for offset management.
-   **Manual ConsumerAwareListenerErrorHandler:** Implemented `ConsumerAwareListenerErrorHandler` for handling exceptions with manual commit.
-   **Manual SeekToCurrentErrorHandler:** Implemented `SeekToCurrentErrorHandler` for retrying failed messages with manual commit.
-   **Completed:** Đã hoàn thành các demo cho các tính năng sau:
    - Các chiến lược quản lý offset (Auto-commit và Manual commit).
    - Hướng dẫn sử dụng `ConsumerAwareListenerErrorHandler` để xử lý exception trong quá trình consumption.
    - Giải thích cách sử dụng `SeekToCurrentErrorHandler` để retry các message bị lỗi.
-   **Updated Memory Bank:** Đã cập nhật Memory Bank.
-   **Updated README.md:** Đã cập nhật README.md.
-   **Committed Project:** Đã commit project.
-   **Created tag "Lesson-4a":** Đã tạo tag "Lesson-4a".
-   **Created tag "Lesson-4b":** Đã tạo tag "Lesson-4b".

## What's left to build

-   **Kafka Streams and Kafka Connect:** Explore Kafka Streams for stream processing and Kafka Connect for integrating with other data sources.
-   **Security:** Implement security configurations for Kafka.
-   **Performance optimization:** Optimize Kafka performance by tuning various configuration parameters.
-   **Avro/Schema Registry:** Integrate Avro and Schema Registry for schema evolution and data serialization.
-   **Unit tests:** Write unit tests for the producer and consumer.

## Current status

-   **Completed:** Basic Kafka setup and integration with Spring Boot.
-   **Completed:** Explained and configured offset and group ID management in Spring Boot.
-   **Completed:** Implemented auto-commit strategy for offset management.
-   **Completed:** Implemented `ConsumerAwareListenerErrorHandler` for handling exceptions.
-   **Completed:** Implemented `SeekToCurrentErrorHandler` for retrying failed messages.
-   **Completed:** Implemented manual commit strategy for offset management.
-   **Completed:** Implemented `ConsumerAwareListenerErrorHandler` for handling exceptions with manual commit.
-   **Completed:** Implemented `SeekToCurrentErrorHandler` for retrying failed messages with manual commit.
-   **Completed:** Đã hoàn thành các demo cho các tính năng sau:
    - Các chiến lược quản lý offset (Auto-commit và Manual commit).
    - Hướng dẫn sử dụng `ConsumerAwareListenerErrorHandler` để xử lý exception trong quá trình consumption.
    - Giải thích cách sử dụng `SeekToCurrentErrorHandler` để retry các message bị lỗi.

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
- [x] Create tag Lesson-2
- [x] Cấu hình `key-deserializer` và `value-deserializer` cho consumer trong `application.properties`
- [x] Kiểm tra hoạt động của Consumer
- [x] Explain Kafka consumer groups and offset management.
- [x] Configure consumer groups and offsets in Spring Boot.
- [x] Provide examples of different offset management strategies.
- [x] Discuss scenarios where manual offset management is necessary.
- [x] Show how to use `ConsumerAwareListenerErrorHandler` to handle exceptions during consumption.
- [x] Explain how to use `SeekToCurrentErrorHandler` to retry failed messages.
- [x] Implement Offset Management Strategies Demo (Auto-commit)
- [x] Implement ConsumerAwareListenerErrorHandler Demo (Auto-commit)
- [x] Implement SeekToCurrentErrorHandler Demo (Auto-commit)
- [x] Update Memory Bank (Auto-commit)
- [x] Update README.md (Auto-commit)
- [x] Commit Project (Auto-commit)
- [x] Create tag "Lesson-4a"
- [x] Implement Offset Management Strategies Demo (Manual commit)
- [x] Implement ConsumerAwareListenerErrorHandler Demo (Manual commit)
- [x] Implement SeekToCurrentErrorHandler Demo (Manual commit)
- [x] Update Memory Bank (Manual commit)
- [x] Update README.md (Manual commit)
- [x] Commit Project (Manual commit)
- [x] Create tag "Lesson-4b"
