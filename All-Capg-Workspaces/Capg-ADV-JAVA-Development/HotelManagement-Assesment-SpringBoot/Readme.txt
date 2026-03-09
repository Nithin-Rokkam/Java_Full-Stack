# Hotel Management System - Spring Boot Application

## Project Overview
This is a Hotel Management System built with Spring Boot 3.2.3, Spring Data JPA, and MySQL database. The application provides REST APIs to manage hotel rooms and bookings.

## Technologies Used
- **Spring Boot**: 3.2.3
- **Java**: 17
- **Spring Data JPA**: For database operations using EntityManager
- **MySQL**: Database
- **Maven**: Build tool
- **Jakarta Persistence API**: For entity mappings

## Project Structure
```
src/main/java/com/capg/springboot/
├── HotelManagementAssesmentSpringBootApplication.java  # Main application class
├── controller/
│   ├── BookingController.java                          # REST endpoints for bookings
│   └── RoomController.java                             # REST endpoints for rooms
├── entity/
│   ├── Booking.java                                    # Booking entity
│   └── Room.java                                       # Room entity
├── exception/
│   ├── GlobalExceptionHandler.java                     # Global exception handler
│   └── RoomNotVacantException.java                     # Custom exception for room conflicts
├── repository/
│   ├── BookingRepository.java                          # Booking JPA repository
│   └── RoomRepository.java                             # Room JPA repository
└── service/
    ├── BookingService.java                             # Booking service interface
    ├── RoomService.java                                # Room service interface
    └── impl/
        ├── BookingServiceImpl.java                     # Booking service implementation
        ├── RoomServiceImpl.java                        # Room service implementation
        └── ResousrseNotFoundException.java             # Custom exception
```

## Database Configuration
Update the following properties in `src/main/resources/application.properties`:

```properties
spring.application.name=HotelManagement-Assesment-SpringBoot
server.port=9998

spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/mycapgdb
spring.datasource.username=root
spring.datasource.password=admin123
```

**Note**: Make sure MySQL is running and the database `mycapgdb` exists.

## How to Run the Application

### Prerequisites
- Java 17 or higher installed
- MySQL Server running
- Maven (or use the included Maven wrapper)

### Steps to Run
1. **Navigate to project directory**:
   ```cmd
   cd C:\Capgemini-Training\All-Capg-Workspaces\Capg-ADV-JAVA-Development\HotelManagement-Assesment-SpringBoot
   ```

2. **Build the project**:
   ```cmd
   mvnw.cmd clean install
   ```

3. **Run the application**:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

4. The application will start on **http://localhost:9998**

## API Documentation

### Room Management APIs

#### Base URL: `http://localhost:9998/rooms`

#### 1. Create a New Room
- **Endpoint**: `POST /rooms/add`
- **Description**: Adds a new room to the hotel
- **Request Body**:
  ```json
  {
    "roomId": 101,
    "roomNumber": "R101",
    "roomType": "Deluxe",
    "price": 2500.00,
    "status": "Available"
  }
  ```
- **Response**: Returns the created room object
- **Example**:
  ```cmd
  curl -X POST http://localhost:9998/rooms/add -H "Content-Type: application/json" -d "{\"roomId\":101,\"roomNumber\":\"R101\",\"roomType\":\"Deluxe\",\"price\":2500.00,\"status\":\"Available\"}"
  ```

#### 2. Get All Rooms
- **Endpoint**: `GET /rooms/all`
- **Description**: Retrieves all rooms in the hotel
- **Response**: List of all room objects
- **Example**:
  ```cmd
  curl -X GET http://localhost:9998/rooms/all
  ```

#### 3. Get Room by ID
- **Endpoint**: `GET /rooms/{roomId}`
- **Description**: Retrieves a specific room by its ID
- **Path Variable**: `roomId` (integer)
- **Response**: Room object
- **Example**:
  ```cmd
  curl -X GET http://localhost:9998/rooms/101
  ```

#### 4. Update Room
- **Endpoint**: `PUT /rooms/update/{roomId}`
- **Description**: Updates an existing room
- **Path Variable**: `roomId` (integer)
- **Response**: Updated room object
- **Example**:
  ```cmd
  curl -X PUT http://localhost:9998/rooms/update/101
  ```

#### 5. Delete Room
- **Endpoint**: `DELETE /rooms/delete/{roomId}`
- **Description**: Deletes a room from the system
- **Path Variable**: `roomId` (integer)
- **Response**: No content (void)
- **Example**:
  ```cmd
  curl -X DELETE http://localhost:9998/rooms/delete/101
  ```

---

### Booking Management APIs

#### Base URL: `http://localhost:9998/bookings`

#### 1. Create a New Booking
- **Endpoint**: `POST /bookings/create`
- **Description**: Creates a new booking for a customer
- **Validation**: Automatically checks if the room is available for the requested dates
- **Request Body**:
  ```json
  {
    "customerName": "John Doe",
    "customerPhone": "9876543210",
    "checkInDate": "2026-03-10",
    "checkOutDate": "2026-03-15",
    "room": {
      "roomId": 101
    }
  }
  ```
- **Success Response**: Returns the created booking object with HTTP 200
- **Error Response (409 Conflict)**: If room is already booked for overlapping dates
  ```json
  {
    "timestamp": "2026-03-08T10:30:00",
    "status": 409,
    "error": "Conflict",
    "message": "Room is not vacant",
    "path": "/bookings/create"
  }
  ```
- **Example**:
  ```cmd
  curl -X POST http://localhost:9998/bookings/create -H "Content-Type: application/json" -d "{\"customerName\":\"John Doe\",\"customerPhone\":\"9876543210\",\"checkInDate\":\"2026-03-10\",\"checkOutDate\":\"2026-03-15\",\"room\":{\"roomId\":101}}"
  ```

#### 2. Get All Bookings
- **Endpoint**: `GET /bookings/all`
- **Description**: Retrieves all bookings in the system
- **Response**: List of all booking objects
- **Example**:
  ```cmd
  curl -X GET http://localhost:9998/bookings/all
  ```

#### 3. Get Booking by ID
- **Endpoint**: `GET /bookings/{bookingid}`
- **Description**: Retrieves a specific booking by its ID
- **Path Variable**: `bookingid` (integer)
- **Response**: Booking object
- **Example**:
  ```cmd
  curl -X GET http://localhost:9998/bookings/1
  ```

#### 4. Update Booking
- **Endpoint**: `PUT /bookings/update/{bookingid}`
- **Description**: Updates an existing booking
- **Validation**: Checks if room is available for the updated dates (excludes current booking)
- **Path Variable**: `bookingid` (integer)
- **Response**: Updated booking object
- **Error Response (409 Conflict)**: If room is booked by another booking for overlapping dates
- **Example**:
  ```cmd
  curl -X PUT http://localhost:9998/bookings/update/1
  ```

#### 5. Cancel Booking
- **Endpoint**: `DELETE /bookings/cancel/{bookingid}`
- **Description**: Cancels and deletes a booking
- **Path Variable**: `bookingid` (integer)
- **Response**: No content (void)
- **Example**:
  ```cmd
  curl -X DELETE http://localhost:9998/bookings/cancel/1
  ```

---

## Testing with Postman

### Setting up Postman Collection

1. **Create Room**
   - Method: POST
   - URL: `http://localhost:9998/rooms/add`
   - Headers: `Content-Type: application/json`
   - Body (raw JSON):
     ```json
     {
       "roomId": 101,
       "roomNumber": "R101",
       "roomType": "Deluxe",
       "price": 2500.00,
       "status": "Available"
     }
     ```

2. **Get All Rooms**
   - Method: GET
   - URL: `http://localhost:9998/rooms/all`

3. **Create Booking**
   - Method: POST
   - URL: `http://localhost:9998/bookings/create`
   - Headers: `Content-Type: application/json`
   - Body (raw JSON):
     ```json
     {
       "customerName": "John Doe",
       "customerPhone": "9876543210",
       "checkInDate": "2026-03-10",
       "checkOutDate": "2026-03-15",
       "room": {
         "roomId": 101
       }
     }
     ```

4. **Get All Bookings**
   - Method: GET
   - URL: `http://localhost:9998/bookings/all`

### Testing Room Vacancy Validation

To test the room vacancy conflict feature:

**Step 1**: Create a room first
```json
POST http://localhost:9998/rooms/add
{
  "roomId": 101,
  "roomNumber": "R101",
  "roomType": "Deluxe",
  "price": 2500.00,
  "status": "Available"
}
```

**Step 2**: Create first booking (should succeed)
```json
POST http://localhost:9998/bookings/create
{
  "customerName": "Alice Smith",
  "customerPhone": "9876543210",
  "checkInDate": "2026-03-10",
  "checkOutDate": "2026-03-15",
  "room": {"roomId": 101}
}
```
✅ **Expected**: Booking created successfully

**Step 3**: Try to book same room with overlapping dates (should fail)
```json
POST http://localhost:9998/bookings/create
{
  "customerName": "Bob Johnson",
  "customerPhone": "9123456789",
  "checkInDate": "2026-03-12",
  "checkOutDate": "2026-03-18",
  "room": {"roomId": 101}
}
```
❌ **Expected**: HTTP 409 Conflict
```json
{
  "timestamp": "2026-03-08T...",
  "status": 409,
  "error": "Conflict",
  "message": "Room is not vacant",
  "path": "/bookings/create"
}
```

**Step 4**: Book same room for non-overlapping dates (should succeed)
```json
POST http://loca