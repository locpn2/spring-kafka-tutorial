# Technical Context: Spring Kafka Tutorial

## Technologies Used

-   **Java:** Programming language for the Spring Boot application.
-   **Spring Boot:** Framework for building the application.
-   **Spring Kafka:** Library for integrating Apache Kafka with Spring Boot.
-   **Apache Kafka:** Distributed streaming platform for handling real-time data feeds.
-   **Zookeeper:** Centralized service for maintaining configuration information, naming, providing distributed synchronization, and group services.
-   **Docker Compose:** Tool for defining and running multi-container Docker applications.
-   **Kafka UI:** Web interface for monitoring and managing Kafka clusters.
-   **Maven:** Build automation tool for managing dependencies and building the project.
-   **Git Bash:** Terminal for running commands.

## Development Setup

1.  **Java Development Kit (JDK):** Version 17 or higher.
2.  **Apache Maven:** Version 3.6 or higher.
3.  **Docker:** Docker Engine and Docker Compose installed.
4.  **Integrated Development Environment (IDE):** VSCode, IntelliJ IDEA, or Eclipse.

## Technical Constraints

-   **Port Conflicts:** Ensure that port 8080 (for Spring Boot) and 8082 (for Kafka UI) are not already in use.
-   **Kafka Broker Address:** The Spring Boot application must be able to connect to the Kafka broker at `localhost:9092`.
-   **Docker Resource Limits:** Ensure that Docker has enough resources (CPU, memory) to run the Kafka cluster.
-   **Git Bash Compatibility:** Ensure commands are compatible with Git Bash.

## Dependencies

-   **Spring Boot Starter Web:** For building RESTful web applications.
-   **Spring Kafka:** For integrating with Apache Kafka.
-   **Lombok:** For reducing boilerplate code.
-   **Spring Boot Starter Test:** For writing unit and integration tests.
-   **Spring Kafka Test:** For testing Spring Kafka applications.

## Tool Usage Patterns

-   **Maven:**
    -   `mvn spring-boot:run`: To start the Spring Boot application.
    -   `mvn clean install`: To build the project and install dependencies.
-   **Docker Compose:**
    -   `docker-compose up -d`: To start the Kafka cluster.
    -   `docker-compose down`: To stop the Kafka cluster.
-   **Git Bash:**
    -   `curl`: To send HTTP requests to the Spring Boot application.
    -   `docker-compose`: To manage the Kafka cluster.
