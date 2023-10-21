# vollmed-api
Spring Boot

**Spring Boot Project: Enhancing the API with Spring Security and ResponseEntity**

This project aims to improve a Spring Boot application, making it more robust and secure. Some of the key features and functionalities include:

**1. Customization of API Responses with ResponseEntity:**
   - Use of the Spring ResponseEntity class to customize the returns of methods in a Controller.
   - Modification of HTTP codes in API responses to provide more detailed information.

**2. Adding Headers to Responses:**
   - Implementation of the ability to add custom headers to API responses, providing greater flexibility.

**3. Using Appropriate HTTP Codes:**
   - Assigning the most appropriate HTTP codes for each operation performed in the API, improving the semantics of responses.

**4. Exception Handling:**
   - Creation of a dedicated class to isolate exception handling in the API, using the @RestControllerAdvice annotation.
   - Use of the @ExceptionHandler annotation to indicate which exception a specific method in the error-handling class should catch.
   - Handling of errors such as 404 (Not Found) and 400 (Bad Request) for Bean Validation errors.
   - Simplifying the JSON returned by the API in cases of Bean Validation errors.

**5. Authentication and Authorization:**
   - Integration of Spring Security into the application to manage the authentication and authorization process in a REST API.
   - Implementation of the default behavior of Spring Security in the application.
   - Stateless authentication of the API, leveraging Spring Security classes and configurations.

**6. Token Generation with Auth0 java-jwt:**
   - Addition of the Auth0 java-jwt library as a project dependency.
   - Use of this library to generate tokens in the API.
   - Injection of properties from the application.properties file into a class managed by Spring using the @Value annotation.
   - Provision of generated tokens in the API when a user authenticates.

**7. Implementation of Filters:**
   - Functionality of filters in a request for additional processing.
   - Creation of a filter through a class that inherits from the Spring OncePerRequestFilter class.
   - Validation of tokens received in the API using the Auth0 java-jwt library.
   - Authentication of the request through the Spring SecurityContextHolder class.
   - Granting and restricting requests based on the URL and HTTP protocol verb, enhancing the application's security.

This project encompasses several important enhancements and functionalities to improve a Spring Boot application, from exception handling to API security and customization of HTTP responses.
