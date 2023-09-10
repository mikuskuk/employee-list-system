# Vue.js Employee List Frontend

This is a simple Vue.js frontend application for displaying a list of employees. It communicates with a backend API to fetch and display employee data in a tabular format.

## Features

- Displays a list of employees with their details.
- Fetches employee data from a backend API.
- Uses Bootstrap for styling to create an appealing user interface.

## Project Structure

- EmployeeList.vue: This component represents the main page of the application. It fetches and displays the list of employees in a table.

- App.vue: This is the root component of the Vue.js application. It imports and uses the EmployeeList component.

- services/EmployeeService.js: This file contains the logic for making API requests to fetch employee data.

## Usage

1. Clone the repository to your local machine.
2. Install the required dependencies using `npm install`.
3. Run the application using `npm run serve`.
4. Access the application in your browser at the specified URL (usually `http://localhost:8081`).

## Technologies Used

- Vue.js: A popular JavaScript framework for building user interfaces.
- Bootstrap: A CSS framework for styling web applications.
- Axios: A library for making HTTP requests to interact with the backend API.