# Vue.js Frontend & Spring Boot Backend Employee Management System

This project consists of two parts: a Vue.js frontend application and a Spring Boot backend application. Together, they create an Employee Management System for viewing and managing employee data.

## Frontend (Vue.js)

This is a simple Vue.js frontend application for displaying a list of employees. It communicates with a backend API to fetch and display employee data in a tabular format.

### Features

- Displays a list of employees with their details.
- Fetches employee data from a backend API.
- Uses Bootstrap for styling to create an appealing user interface.

### Project Structure

- EmployeeList.vue: This component represents the main page of the application. It fetches and displays the list of employees in a table.
- App.vue: This is the root component of the Vue.js application. It imports and uses the EmployeeList component.
- services/EmployeeService.js: This file contains the logic for making API requests to fetch employee data.

### Usage

1. Clone the repository to your local machine.
2. Install the required dependencies using `npm install`.
3. Run the application using `npm run serve`.
4. Access the application in your browser at the specified URL (usually `http://localhost:8081`).

### Technologies Used

- Vue.js: A popular JavaScript framework for building user interfaces.
- Bootstrap: A CSS framework for styling web applications.
- Axios: A library for making HTTP requests to interact with the backend API.

## Backend (Spring Boot)

### Features

- Implements a RESTful API for managing employee data.
- Uses Spring Data JPA for database interaction.

### Project Structure

- Employee.java: This class defines the Employee entity with attributes such as id, firstName, lastName, and email.
- EmployeeController.java: This class defines the RESTful API endpoints for fetching employee data.
- EmployeeRepository.java: This interface extends JpaRepository and provides methods for database operations on the Employee entity.
- SpringbootBackendApplication.java: The main class that runs the Spring Boot application and preloads some sample employee data into the database.

### Usage

1. Clone the repository to your local machine.
2. Open the Spring Boot project in your preferred Java IDE.
3. Run the Spring Boot application.
4. The backend API will be accessible at `http://localhost:8080/api/employees`.

### Technologies Used

- Spring Boot: A Java-based framework for building web applications.
- Spring Data JPA: Part of the Spring Data project, it simplifies database access with JPA.
- H2 Database: An in-memory database used for storing employee data.

## Project Setup

To run the complete project (frontend and backend), follow these steps:

1. Clone both the frontend and backend repositories to your local machine.
2. Follow the usage instructions for each part (frontend and backend) as mentioned above.