# Branch Take Home Project

## Description

A simple service that exposes an endpoint for callers to get a specific user's GitHub profile.

## Installation

### Dependencies

- Java17

### Build

To build the application, run the following command in the terminal, under the project root directory.
```
./gradlew build
```

### Executing program

To run the application, run the following command in the terminal, under the project root directory.
```
./gradlew Bootrun
```


## How to use the service

You may use any tool you want, some popular tool like Postman comes handy: https://www.postman.com/

This is the endpoint you want to hit after the server spins up: 
```
http://localhost:8080/user/<username>

example: 
http://localhost:8080/user/octocat
http://localhost:8080/user/chiakowu
```

## Architecture

### Controller / Service / HTTP client / Data

The stucture of this project is pretty simple. Where we have:
- `UserController` that defines the path of an endpoint
- `UserService` where we put our business logic
- `GitHubClient` makes the actual call to GitHub's public API
- Also we have the data model for processing the data from GitHub, and the data model for the response what the customer is looking for.



### Jakarta RESTful Web Services / JAX-RS

I used a pretty standard, widely use, industry standard Jakarta RESTful Web Services / JAX-RS to build the RESTful API service. The library is ease to use and integrates perfectly with Spring Framework, with a rich feature set.

For more information, check out the official documentation: https://eclipse-ee4j.github.io/jersey/

### Lombok

`@Value` and `@Builder` are annotations used to enhance code readability, and make it clean and concise. 

For more information, check out Lombok's documentation:

`@Value`: https://projectlombok.org/features/Value

`@Builder`: https://projectlombok.org/features/Builder


## Author


Chia-ko (Jeffrey) Wu

Email: jeffrey840130@gmail.com

## Version History

* 0.1
    * Initial Release - also the last release :)
