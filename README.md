# Spring Boot Blog App REST APIs

This is a RESTful API for managing blog posts and comments built using the Spring Boot framework.

## Table of Contents
- [Description](#description)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [API Documentation](#api-documentation)
- [Running the Tests](#running-the-tests)
- [Features](#features)
- [Built With](#built-with)
- [Authors](#authors)
- [License](#license)

## Description

Spring Boot Blog App REST APIs is a web application that allows users to create, read, update, and delete blog articles and comments. The API endpoints are designed to be RESTful, making it easy to interact with the application programmatically.

## Getting Started

To get started with this project, clone the repository and run it in your local environment. The following instructions will guide you through the process:

### Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository:

   ```
   git clone https://github.com/chhinhua/spring-boot-blog-rest-api.git
2. Navigate to the project directory:

   ```
   cd spring-boot-blog-rest-api
3. Build and run the project:

   ```
   mvn spring-boot:run
   
## API Documentation

The API documentation is available at /swagger-ui/index.html. You can access it by opening a web browser and navigating to http://localhost:8080/swagger-ui/index.html.

## Running the Tests

To run the tests, navigate to the project directory and execute the following command:
   
    mvn test
   
   
## Features

- Signup, signin
- Create, read, update, and delete catetories
- Create, read, update, and delete blog posts
- Create, read, update, and delete comments on blog posts
- Get a list of blog posts sorted by properties(default "id") with pageNumber, pageSize and sorted direction (default "ASC")

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Maven](https://maven.apache.org/) - Dependency management
- [Swagger](https://swagger.io/) - API documentation

## Authors

- Chhin Hua - [Linkedin](https://www.linkedin.com/in/chhin-hua/)

   

