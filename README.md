# Event Management System

The Event Management System is a comprehensive web application built with the Java Spring Framework. This application facilitates the management of events, including creation, event searching based on tags, and deletion . The project integrates Thymeleaf for server-side rendering of dynamic web pages, uses MySQL for data persistence, and employs Gradle for build and dependency management.

## Project Overview

The application provides a robust platform for organizing and managing events, such as conferences, workshops, and social gatherings. It features a user-friendly interface built with Thymeleaf, with data managed through a MySQL database. The system supports functionalities for event creation, viewing, updating, and deleting, along with user registration and event registration.

## Technologies Used

- **Backend:** Java Spring Framework
- **Frontend:** Thymeleaf
- **Database:** MySQL
- **Build Tool:** Gradle

## Key Components and Features

### 1. Backend (Java Spring)
- **Spring Boot:** Provides the foundational setup and configuration for the application, simplifying the development process.
- **Spring MVC:** Manages HTTP requests and responses, implementing RESTful endpoints, and integrates with Thymeleaf for rendering views.
- **Spring Data JPA:** Facilitates data access and management using JPA repositories for CRUD operations.
- **Spring Security:** Ensures the security of the application, handling user authentication and authorization for various functionalities.
- **Spring Boot Test:** Supports testing of application components to ensure functionality and reliability.

### 2. Frontend (Thymeleaf)
- **Thymeleaf Templates:** Renders dynamic web pages with server-side processing, providing a clean and maintainable template system.
- **Form Handling:** Processes user inputs and interacts with backend services to manage event registrations and user details.
- **Layouts and Fragments:** Utilizes Thymeleaf features to create reusable components and maintain a consistent look and feel across the application.

### 3. Database (MySQL)
- **Schema Design:** Organizes tables and relationships to manage events, users, and registrations effectively.
- **Data Persistence:** Uses Spring Data JPA for managing data access and performing CRUD operations on MySQL.
- **SQL Queries:** Executes complex queries to retrieve, update, and manipulate event data as needed.

### 4. Build and Dependency Management (Gradle)
- **Gradle Build Tool:** Manages project dependencies and build processes, providing a streamlined development workflow.
- **Dependency Management:** Ensures that all required libraries and frameworks are included and up-to-date.

## Project Setup and Installation
