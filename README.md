# Kafka KRaft project using Saga pattern

A Spring Boot project, witch uses Kafka with KRaft, and Saga pattern for sequence of local transactions, where each transaction updates data within a single service.
Saga maintains data consistency across multiple services in a microservices architecture.


## Table of contents

1. [Instalation](#instalation)
2. [Endpoints](#endpoints)


## Instalation

Check that you have docker started, then run docker compose file.
``` bash
docker compose up
```

Run the `CreditCardProcessorServiceApplication`, `OrdersServiceApplication`, `PaymentsServiceApplication`, `ProductServiceApplication` microservices.


## Endpoints

- **POST http://localhost:8081/products**
    - **Description:** Allows you to create a new product.
    - **Body of the request:**
        - `{ "name": "Name", "price": Price(number), "quantity": Quantity(number) }`
    - **Response:**
        - State 201 Created.
        - State 400 Bad Request.

- **POST http://localhost:8080/orders**
    - **Description:** Allows you to create a new order.
    - **Body of the request:**
        - `{ "productId": "Product(UUID)", "productQuantity": Quantity(number), "customerId": "Customer(UUID)" }`
    - **Response:**
        - State 201 Created.
        - State 400 Bad Request.

- **GET http://localhost:8080/orders/<orderId>/history**
    - **Description:** Two records are obtained, the first is the order and the second is the payment.
    - **Response:**
        - State 200 OK


## Authors

- [@Juan Ignacio Caprioli (ChanoChoca)](https://github.com/ChanoChoca)
