# Product Context: Spring Kafka Tutorial

## Why this project exists

Dự án này được tạo ra nhằm mục đích cung cấp một tài liệu hướng dẫn thực tế và dễ hiểu về cách tích hợp Apache Kafka với Spring Boot. Kafka là một nền tảng streaming phân tán mạnh mẽ, nhưng việc thiết lập và sử dụng nó có thể phức tạp đối với người mới bắt đầu. Dự án này sẽ giúp thu hẹp khoảng cách đó bằng cách cung cấp các ví dụ mã nguồn và hướng dẫn từng bước.

## Problems it solves

-   **Thiếu tài liệu thực tế:** Nhiều tài liệu về Kafka và Spring Boot thường chỉ tập trung vào lý thuyết hoặc các ví dụ quá đơn giản. Dự án này cung cấp một ví dụ hoàn chỉnh, có thể chạy được ngay lập tức.
-   **Khó khăn trong việc thiết lập môi trường:** Việc cài đặt Kafka và các dependency liên quan có thể tốn thời gian. Sử dụng Docker Compose giúp đơn giản hóa quá trình này.
-   **Hiểu biết cơ bản về Kafka:** Dự án giúp người học nắm vững các khái niệm cơ bản về Kafka như Producer, Consumer, Topic, và cách chúng tương tác với nhau trong một ứng dụng Spring Boot.

## How it should work

Dự án sẽ hoạt động như một ứng dụng Spring Boot thông thường, nhưng có thêm khả năng gửi và nhận thông điệp qua Kafka.
-   **Producer:** Một REST endpoint sẽ cho phép người dùng gửi thông điệp đến một Kafka topic.
-   **Consumer:** Một Kafka Listener sẽ tự động lắng nghe các thông điệp từ topic đó và xử lý chúng (ví dụ: in ra console).
-   **Kafka UI:** Cung cấp một giao diện web để theo dõi các topic, thông điệp, và trạng thái của Kafka cluster.

## User experience goals

-   **Dễ dàng thiết lập:** Người dùng có thể khởi động Kafka và ứng dụng Spring Boot một cách nhanh chóng với các lệnh đơn giản.
-   **Hiểu rõ luồng dữ liệu:** Người dùng có thể dễ dàng theo dõi luồng thông điệp từ khi được gửi bởi Producer đến khi được nhận bởi Consumer.
-   **Khả năng mở rộng:** Mã nguồn được tổ chức rõ ràng, cho phép người dùng dễ dàng mở rộng và thêm các tính năng Kafka phức tạp hơn trong tương lai.
-   **Tài liệu đầy đủ:** `README.md` và các file `memory-bank` khác sẽ cung cấp đầy đủ thông tin để người dùng có thể tự học và tham khảo.
