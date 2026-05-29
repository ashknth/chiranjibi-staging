# chiranjibi-staging

Minimal Java Spring Boot application configured to run on port `8080`.

## Requirements

- Java 17+

Maven is optional because this project includes the Maven Wrapper (`./mvnw`).

## Run the app

```bash
./mvnw spring-boot:run
```

Health endpoint:

```bash
curl http://localhost:8080/api/health
```

## Run tests

```bash
./mvnw test
```

## Build a runnable jar

```bash
./mvnw clean package
```

```bash
java -jar target/chiranjibi-staging-0.0.1-SNAPSHOT.jar
```
