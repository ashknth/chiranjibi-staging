# chiranjibi-staging

Minimal Spring Boot application configured for Maven-based builds and production-friendly defaults.

## Requirements

- Java 17+
- Maven Wrapper (`./mvnw`)
- Optional profile overrides via environment-specific Spring configuration

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

Runtime settings live in `src/main/resources/application.yml`.

