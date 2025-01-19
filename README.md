This project is a foundational implementation of a RESTful API using Java. 
It demonstrates core principles of API design and development.
The application is built using standard tools and frameworks to showcase a typical structure for a Java-based API project.

1. Prerequisites
    Java Development Kit (JDK): Version 17 or later.
    IntelliJ IDEA (or any IDE with Spring Boot support).
    Postman (or any HTTP client for testing APIs).
    Maven (for dependency management).

2. Features
    RESTful architecture using Spring Boot.
    CRUD operations on a Product resource.
    In-memory H2 database integration.
    Exception handling with custom error responses.
    API documentation with Swagger UI.
    Layered architecture following best practices.

3. Installation and Setup
  a. Clone the Repository
      git clone https://github.com/your-username/FirstRestAPI.git
      cd FirstRestAPI
  b. Open in IntelliJ IDEA
      Open IntelliJ and select File > Open.
      Navigate to the project directory and open it.
      Wait for Maven to download the dependencies.
  c. Run the Application
      Locate the FirstRestAPIApplication.java file.
      Right-click and select Run.
  d. Access the API Documentation
      After starting the application, navigate to:
      - Swagger UI: http://localhost:8080/swagger-ui/index.html
      - OpenAPI Docs: http://localhost:8080/v3/api-docs

4. Usage
  a. Creating a Product
      POST /api/v1/products
       json
        {
          "name": "Sample Product"
        }
  b. Retrieving a Product
      GET /api/v1/products/{id}
  
  c. Updating a Product
      PUT /api/v1/products/{id}
        json
        {
          "name": "Updated Product Name"
        }
  d. Deleting a Product
      DELETE /api/v1/products/{id}
  
  e. Fetching All Products
      GET /api/v1/products
      
5. Exception Handling
    Custom exceptions are implemented to handle scenarios like:
      Product Not Found: Returns HTTP 404 with a descriptive error message.

6. Adding a Database
    The application uses the H2 in-memory database. To access the database console:
       - Navigate to http://localhost:8080/console.
       - Update the JDBC URL to jdbc:h2:mem:testdb

7. Testing the API
    Use Postman or other API clients to test endpoints. Example for creating a product:
      a. Select POST as the request method.
      b. Enter the URL: http://localhost:8080/api/v1/products.
      c. Provide a JSON body

