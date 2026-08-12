# Taller Programming 2026

## Project Overview

This repository contains the project developed for the Taller de Programación course during 2026 at Universidad Manuela Beltrán. The main purpose of this project is to demonstrate the application of Object-Oriented Programming principles, software architecture concepts, Git version control, and GitHub Copilot as an artificial intelligence programming assistant.

The selected domain for this project is a university enrollment management system. The system represents some of the main entities involved in the enrollment process, including students, courses, professors, and enrollments. The project is organized using a standard Java project structure based on the Maven directory convention, separating the domain, application, infrastructure, and test components.

## Object-Oriented Programming

The project demonstrates several fundamental principles of Object-Oriented Programming. These include encapsulation, inheritance, polymorphism, and abstraction. Each principle is applied to the domain classes in order to create a more organized, reusable, maintainable, and scalable software design.

The domain layer contains the main business entities and their relationships. The application layer is intended to contain the application logic and use cases, while the infrastructure layer can contain technical implementations such as persistence or external services.

## Git and GitHub

Git is used as the version control system for this project. The repository follows the Conventional Commits specification in order to maintain clear and meaningful commit messages. The initial commit establishes the basic project structure and follows the required message:

`feat: initial project structure with Maven layout`

## GitHub Copilot

GitHub Copilot is used as an assistant during the development process. Its suggestions are evaluated critically instead of being accepted without review. The project documents the changes made to Copilot-generated code and analyzes whether the suggestions follow good Object-Oriented Programming practices.

A Copilot code review is also performed on one of the domain classes. The generated feedback is analyzed to determine which issues were identified, whether those observations were correct, and which modifications were applied to improve the code.

## Project Structure

The project follows the following organization:

```text
src/
├── main/
│   └── java/
│       └── com/
│           └── umb/
│               └── taller/
│                   ├── domain/
│                   ├── application/
│                   └── infrastructure/
└── test/
    └── java/
