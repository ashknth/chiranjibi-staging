# chiranjibi-staging

Minimal Java Spring Boot application configured to run on port `8080`.

## Requirements

- Java 17+
- Maven 3.9+

## Run the app

```bash
mvn spring-boot:run
```

Health endpoint:

```bash
curl http://localhost:8080/api/health
```

## Run tests

```bash
mvn test
```
