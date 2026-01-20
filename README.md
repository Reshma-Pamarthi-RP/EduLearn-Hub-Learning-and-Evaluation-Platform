# EduLearn Hub – Learning and Evaluation Platform

EduLearn Hub is a full-stack web-based learning and evaluation platform designed to support structured education workflows. The system enables students and mentors to collaborate through a centralized digital environment where learning materials, quizzes, evaluations, and progress tracking are managed efficiently.

The platform follows a client-server architecture with a modern web frontend and a RESTful backend. It demonstrates practical experience in full-stack application development, REST API design, database modeling, and system integration.

## Project Overview

EduLearn Hub provides an online learning space where students can access educational content, participate in quizzes, and track performance, while mentors can manage subjects, assessments, and learning materials. The platform is designed to replace manual or fragmented learning processes with a scalable, database-driven system.

This project highlights real-world application development concepts such as role-based access control, data persistence, and frontend-backend communication.

## Key Features
### Student Features

Student registration and authentication

View available subjects and quizzes

Attempt quizzes and submit responses

View quiz results and earned credits

Access uploaded learning materials

### Mentor Features

Mentor registration and authentication

Create and manage subjects and quizzes

Upload learning materials

View student participation and performance

Send notifications related to assessments and results

### System Features

Role-based access control for students and mentors

RESTful API communication between frontend and backend

File upload support for learning materials

Email notifications for registrations and quiz results

Relational database design ensuring data integrity

## Technologies Used
### Frontend

Angular

TypeScript

HTML and CSS

Bootstrap

Angular Router

HttpClient for REST API communication

### Backend

Java

Jersey (JAX-RS) for RESTful services

Hibernate ORM for database operations

### MySQL database

JavaMail API for email notifications

Multipart file upload support

## Tools and Platforms

Apache Tomcat for application deployment

Eclipse IDE for backend development

Node.js and npm for frontend dependency management

## Application Architecture

Users interact with the system through the Angular web interface.

The frontend sends HTTP requests to backend REST APIs.

REST endpoints process requests using Jersey.

Business logic and validation are handled in the backend.

Hibernate ORM manages database interactions with MySQL.

Responses are returned in JSON format to the frontend.

The frontend dynamically updates the UI based on API responses.

File uploads and email notifications are processed by backend services.

## Database Design

The application uses a relational database with normalized tables to ensure data consistency and scalability. Key entities include:

Student

Mentor

Subject

Quiz

Quiz Questions

Credits

Learning Materials

Wishlist

Hibernate ORM is used to map Java entities to database tables and manage CRUD operations.

## How to Run the Application
### Backend Setup

Install Java JDK

Install MySQL and create the required database

Update database credentials in hibernate.cfg.xml

Import the backend project into Eclipse

Configure Apache Tomcat in Eclipse

Deploy and start the backend server

Verify backend availability using REST endpoints

### Frontend Setup

Install Node.js and npm

Install Angular CLI compatible with the project version

Navigate to the frontend project directory

Run npm install to install dependencies

Start the application using ng serve with proxy configuration

Access the application at http://localhost:4200

## Security and Best Practices

Sensitive information such as database credentials should not be committed to version control

Environment-specific configurations should be externalized

Role-based access ensures restricted functionality for users

Input validation is handled at the backend level

## Future Enhancements

Payment gateway integration

Real-time notifications

Advanced analytics and reporting dashboards

Mobile application support

Enhanced authentication and authorization mechanisms

## Purpose of the Project

The purpose of EduLearn Hub is to demonstrate the design and development of a scalable, database-driven learning and evaluation platform using modern web technologies. It showcases skills in full-stack development, RESTful API design, database management, and system architecture.
