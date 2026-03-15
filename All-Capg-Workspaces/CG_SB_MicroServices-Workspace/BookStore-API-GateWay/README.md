# BookStore API Gateway

## Overview
The **BookStore API Gateway** is the **single entry point** for all client requests in the BookStore microservices architecture. It routes incoming HTTP requests to the appropriate downstream microservice (`book-service` or `order-service`) using **Spring Cloud Gateway MVC** with **Eureka-based load balancing** (`lb://`).

## Technology Stack
| Technology | Version |
|---|---|
| Java | 21 |
| Spring Boot | 4.0.3 |
| Spring Cloud | 2025.1.0 |
| Spring Cloud Gateway MVC | 2025.1.0 |
| Netflix Eureka Client | 2025.1.0 |
| Build Tool | Gradle |

## Port
| Service | Port |
|---|---|
| API Gateway | **8090** |

## Service Registration
- **Eureka Name:** `api-gateway`
- Registers with Eureka Server at `http://localhost:8761/eureka`

## Project Structure
```
BookStore-API-GateWay/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/demo/
│       │       └── BookStoreApiGateWayApplication.java
│       └── resources/
│           └── application.properties
├── build.gradle
└── README.md
```

## Routing Configuration

### `application.properties`
```properties
server.port=8090
spring.application.name=api-gateway

# Spring Cloud Gateway MVC routes
spring.cloud.gateway.mvc.routes[0].id=book-service
spring.cloud.gateway.mvc.routes[0].uri=lb://book-service
spring.cloud.gateway.mvc.routes[0].predicates[0]=Path=/api/books/**

spring.cloud.gateway.mvc.routes[1].id=order-service
spring.cloud.gateway.mvc.routes[1].uri=lb://order-service
spring.cloud.gateway.mvc.routes[1].predicates[0]=Path=/api/orders/**

eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.client.register-with-eureka=true
eureka.client.fetch-registry=true
```

### Route Summary
| Route ID | Path Pattern | Target Service | Port |
|---|---|---|---|
| `book-service` | `/api/books/**` | `book-service` (via Eureka) | 8081 |
| `order-service` | `/api/orders/**` | `order-service` (via Eureka) | 8082 |

The `lb://` prefix enables **client-side load balancing** through Eureka discovery.

## API Endpoints (via Gateway)

### Book Service Endpoints
| Method | Gateway URL | Routed To |
|---|---|---|
| `GET` | `http://localhost:8090/api/books/getall` | `http://localhost:8081/api/books/getall` |
| `GET` | `http://localhost:8090/api/books/getbook/{id}` | `http://localhost:8081/api/books/getbook/{id}` |
| `POST` | `http://localhost:8090/api/books/add` | `http://localhost:8081/api/books/add` |
| `PUT` | `http://localhost:8090/api/books/update/{id}` | `http://localhost:8081/api/books/update/{id}` |
| `DELETE` | `http://localhost:8090/api/books/delete/{id}` | `http://localhost:8081/api/books/delete/{id}` |

### Order Service Endpoints
| Method | Gateway URL | Routed To |
|---|---|---|
| `GET` | `http://localhost:8090/api/orders` | `http://localhost:8082/api/orders` |
| `GET` | `http://localhost:8090/api/orders/{id}` | `http://localhost:8082/api/orders/{id}` |
| `POST` | `http://localhost:8090/api/orders` | `http://localhost:8082/api/orders` |
| `PUT` | `http://localhost:8090/api/orders/{id}` | `http://localhost:8082/api/orders/{id}` |
| `DELETE` | `http://localhost:8090/api/orders/{id}` | `http://localhost:8082/api/orders/{id}` |

## How to Run

### Prerequisites
- Java 21 installed
- Gradle installed (or use included `gradlew` wrapper)
- EurekaServer running on port 8761
- BookService running on port 8081
- OrderService running on port 8082

### Steps
```cmd
gradlew.bat bootRun
```
Or:
```bash
./gradlew bootRun
```

## Startup Order
```
1. BookStore-EurekaServer  (port 8761)  ← Start First
2. BookStore-BookService   (port 8081)
3. BookStore-OrderService  (port 8082)
4. BookStore-API-Gateway   (port 8090)  ← Start Last
```

## Architecture Diagram
```
Client
  │
  ▼
┌─────────────────────────┐
│  API Gateway (:8090)    │
│  spring.application.    │
│  name = api-gateway     │
└────────────┬────────────┘
             │  routes via lb://
    ┌────────┴─────────┐
    ▼                  ▼
┌──────────┐    ┌──────────────┐
│ book-    │    │ order-       │
│ service  │    │ service      │
│ (:8081)  │    │ (:8082)      │
└──────────┘    └──────────────┘
         ↑Feign↑
         └──────── book-service

All services register with:
┌──────────────────────────┐
│  Eureka Server (:8761)   │
└──────────────────────────┘
```

## Troubleshooting
| Problem | Solution |
|---|---|
| 503 Service Unavailable | Ensure the target service is running and registered in Eureka |
| 404 Not Found | Check that the request path matches a configured route predicate |
| Gateway not discovering services | Ensure `eureka.client.fetch-registry=true` and Eureka is running |
| Port 8090 in use | Change `server.port` in `application.properties` |
