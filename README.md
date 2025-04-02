# Customer Management API

A Spring Boot REST API for managing customer data. This project demonstrates a simple yet complete implementation of a RESTful service with CRUD operations.

## Technologies

- Java 21
- Spring Boot 3.4.4
- Spring Data JPA
- H2 Database (in-memory)
- Maven

## Project Structure

```
JavaSpringAPI/
├── sample/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/apidemo/sample/
│   │   │   │   ├── controller/
│   │   │   │   │   └── CustomerController.java
│   │   │   │   ├── model/
│   │   │   │   │   └── Customer.java
│   │   │   │   ├── repository/
│   │   │   │   │   └── CustomerRepository.java
│   │   │   │   ├── service/
│   │   │   │   │   └── CustomerService.java
│   │   │   │   └── SampleApplication.java
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── data.sql
│   │   └── test/
│   │       ├── java/com/apidemo/sample/
│   │       │   └── SampleApplicationTests.java
│   │       └── resources/
│   │           └── application-test.properties
│   └── pom.xml
└── README.md
```

## API Endpoints

| Method | URL                      | Description                  | Request Body       | Response         |
|--------|--------------------------|------------------------------|-------------------|------------------|
| GET    | /api/customers           | Get all customers           | -                 | Array of Customer|
| GET    | /api/customers/{id}      | Get customer by ID          | -                 | Customer         |
| POST   | /api/customers           | Create new customer         | Customer object   | Customer         |
| PUT    | /api/customers/{id}      | Update customer             | Customer object   | Customer         |
| DELETE | /api/customers/{id}      | Delete customer             | -                 | -                |

## Running the Application

1. Clone the repository
   ```bash
   git clone https://github.com/RobertoBorges/JavaSpringAPI.git
   cd JavaSpringAPI/sample
   ```

2. Build the project
   ```bash
   mvn clean install
   ```

3. Run the application
   ```bash
   mvn spring-boot:run
   ```

4. The API will be available at: `http://localhost:8080/api/customers`

5. Access the H2 console at: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:customerdb`
   - Username: `sa`
   - Password: `password`

## Testing

Run the tests using:
```bash
mvn test
```

The application uses a separate test database configuration defined in `application-test.properties`.

## Configuration

### Main Configuration (application.properties)
```properties
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:customerdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA/Hibernate Configuration
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.defer-datasource-initialization=true
spring.sql.init.mode=always
```

### Test Configuration (application-test.properties)
```properties
spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
```

## License

[MIT License](LICENSE)
