# All-about-RestApi
This project demonstrates a production-grade REST API built using Spring Boot.
It follows best practices and includes:

Validation

Documentation using Swagger

Content Negotiation

Internationalization (i18n)

API Versioning

HATEOAS (Hypermedia as the Engine of Application State)

Static and Dynamic Filtering

Monitoring

Spring Security for API protection

Features
1. Validation
Request payloads are validated using annotations like @NotNull, @Size, @Email.

Returns meaningful error messages for invalid inputs.

Supports custom validation messages.

2. Documentation using Swagger
Auto-generated interactive API documentation with Swagger UI.

Explore and test APIs directly from the browser.

OpenAPI 3 standard is followed.

Swagger URL: http://localhost:8080/swagger-ui.html

3. Content Negotiation
Supports response formats like JSON and XML.

Format selection through Accept header.

4. Internationalization (i18n)
API supports multiple languages.

Language switching using the Accept-Language header.

Example: English (default), French (fr), Spanish (es).

5. Versioning
Multiple strategies:

URI Versioning: /v1/users, /v2/users

Request Parameter Versioning: /users?version=1

Header Versioning: X-API-VERSION: 1

Media Type (Accept Header) Versioning

6. HATEOAS
API responses include relevant links to other resources.

Clients can navigate the API dynamically without knowing all URIs in advance.

7. Static Filtering
Certain sensitive fields (e.g., passwords) are permanently hidden from API responses.

8. Dynamic Filtering
Fields shown in the response can be customized based on API endpoint or user roles.

9. Monitoring
Integrated with Spring Boot Actuator.

Key endpoints:

/actuator/health

/actuator/metrics

Useful for production monitoring and integration with tools like Prometheus, Grafana.

10. Security (Spring Security)
Basic Authentication and Token-Based Authentication supported.

Secures all REST endpoints:

Only authenticated users can access APIs.

Swagger UI is protected (optional config to allow open access for dev).

Passwords are encrypted using BCrypt.

Roles and authorities can be assigned for fine-grained access control.

Running the Application
bash
Copy
Edit
./mvnw spring-boot:run
or

bash
Copy
Edit
mvn spring-boot:run
Access the secured Swagger UI:

bash
Copy
Edit
http://localhost:8080/swagger-ui.html
Note: You need to log in with valid credentials to access protected resources.

Default Credentials (for testing)

Username	Password	Role
user	password	USER
admin	admin123	ADMIN
(In production, always store credentials securely and do not hard-code.)

Technology Stack
Java 17+

Spring Boot

Spring MVC

Spring Security

Spring Actuator

Swagger (OpenAPI 3)

Maven

Setup Instructions
Clone the repository:

bash
Copy
Edit
git clone https://github.com/yourusername/rest-api-project.git
Navigate to the project directory.

Build and run:

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
API will be running at http://localhost:8080/.

Example API Endpoints
GET /v1/users - Fetch all users

POST /v1/users - Create a user

GET /v1/users/{id} - Fetch a user by ID

GET /actuator/health - Check API health (secured)

POST /login - Authentication endpoint (for JWT if token-based auth is added)
