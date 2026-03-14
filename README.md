# Scrum Simulator

Scrum Simulator is a Java Swing application that models a lightweight Scrum workflow for classroom use. It was originally built as a collaborative academic project and is now maintained here as a public portfolio project.

The application provides separate role-based experiences for administrators, simulation operators, and role players, with shared data stored in MySQL. It combines backlog management, user administration, simulation flow, reporting, and feedback collection in a desktop interface.

## Overview

This project was created to demonstrate core Scrum concepts through an interactive desktop system. Users can manage team access, maintain user stories, configure sprint settings, run a simulation flow, review progress artifacts, and capture feedback.

## Features

- Role-based login for Admin, Simulation Operator, and Role Player users
- Admin workflows for adding users, managing users, and reviewing submitted feedback
- Simulation Operator workflows for viewing, adding, editing, and deleting user stories
- Sprint configuration and simulation-related screens for progressing through the Scrum flow
- Reporting screens and burndown chart visualization using JFreeChart
- MySQL-backed persistence for users, stories, reports, and feedback
- JUnit-based test coverage for several UI flows and screens

## Tech Stack

- Java 17
- Java Swing
- Maven
- MySQL
- JFreeChart
- JUnit 5
- Mockito

## Project Structure

```text
Scrum-Simulator/
|-- README.md
`-- ScrumSimulator/
    |-- pom.xml
    `-- src/
        |-- main/java/com/mycompany/scrumsimulator/
        `-- test/java/com/mycompany/scrumsimulator/
```

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.8 or later
- Network access to the configured MySQL instance, or your own compatible MySQL database

### Build

From the `ScrumSimulator` directory:

```bash
mvn clean package
```

This produces an executable fat JAR in:

```text
ScrumSimulator/target/ScrumSimulator-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### Run

From the `ScrumSimulator` directory:

```bash
java -jar target/ScrumSimulator-1.0-SNAPSHOT-jar-with-dependencies.jar
```

You can also run the app directly with Maven:

```bash
mvn exec:java
```

## User Roles

### Admin

- Add new users
- Manage existing users
- View feedback submitted during the simulation

### Simulation Operator

- View user stories
- Add, edit, and delete user stories
- Configure sprint parameters
- Start the simulation flow
- Submit feedback

### Role Player

- Authenticate into the application as a role-based participant
- Interact with the role-player login flow included in the current build

## Testing

From the `ScrumSimulator` directory:

```bash
mvn test
```

## Important Notes

- The current implementation uses direct MySQL connections inside several UI classes.
- Database connection values are currently embedded in the source code from the original coursework setup.
- If you plan to keep this repository public long-term, moving credentials to environment variables or a local configuration file is strongly recommended.
- Application behavior depends on the available database schema and seed data, including user accounts and user stories.

## Future Improvements

- Externalize configuration and secrets
- Add database schema/setup scripts
- Improve separation between UI, business logic, and persistence
- Expand automated testing beyond UI-oriented flows
- Add screenshots and sample data for easier onboarding

## Contributors

- Nithin Reddy Challa
- Sainath Reddy Durgampudi
- Naga Venkata Sri Sai Eshwar Gulupalli
- Neha Nishal Goud Sharvayigari
- Anirudh Jayamangala Srinivas

## License

No license has been added yet. If you plan to share or reuse this project publicly, adding a license file is recommended.
