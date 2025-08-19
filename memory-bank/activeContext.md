# Active Context: Spring Kafka Tutorial

## Current Work Focus

Chúng ta đang thực hiện các demo cho các tính năng sau:
- Các chiến lược quản lý offset (Auto-commit).
- Hướng dẫn sử dụng `ConsumerAwareListenerErrorHandler` để xử lý exception trong quá trình consumption.
- Giải thích cách sử dụng `SeekToCurrentErrorHandler` để retry các message bị lỗi.

## Recent Changes

- Đã tạo các topic "offset-topic", "error-topic", và "retry-topic".
- Đã triển khai producer để gửi message đến các topic.
- Đã triển khai consumer với chiến lược auto-commit.
- Đã triển khai `ConsumerAwareListenerErrorHandler` để xử lý exception.
- Đã triển khai `SeekToCurrentErrorHandler` để retry các message bị lỗi.
- Đã tạo các endpoint trong `KafkaController` để gửi message đến các topic và mô phỏng các lỗi.

## Next Steps

- Cập nhật Memory Bank.
- Cập nhật README.md.
- Commit Project.
- Tạo tag "Lesson-4a".
- Thực hiện các demo cho các tính năng sau (Manual commit):
    - Các chiến lược quản lý offset.
    - Hướng dẫn sử dụng `ConsumerAwareListenerErrorHandler` để xử lý exception trong quá trình consumption.
    - Giải thích cách sử dụng `SeekToCurrentErrorHandler` để retry các message bị lỗi.

## Important Patterns and Preferences

- Sử dụng Docker Compose để quản lý môi trường Kafka.
- Cấu hình qua `application.properties`.
- Tổ chức mã nguồn rõ ràng.
- Tài liệu hóa đầy đủ trong Memory Bank.

## Learnings and Project Insights

- Đã học được cách tạo các topic, producer, consumer, error handler, và retry handler.
- Đã học được cách cấu hình các thuộc tính cho consumer và producer.
- Đã học được cách sử dụng các annotation `@KafkaListener`, `@Bean`, `@Autowired`, `@GetMapping`, và `@PostMapping`.
