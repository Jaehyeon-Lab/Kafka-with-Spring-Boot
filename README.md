This is a template project to run Kafka with Spring Boot servers.

## Dependencies

The project uses 'apache/kafka:latest' docker image for Kafka, Spring Boot 4.0.0 for servers. Details can be found in `build.gradle` in each module(e.g. consumer).

You need Java 17+ to run the Spring Boot Servers, and Docker to run the Kafka images, and Spring Boot servers except for the main branch.

---

## Branches

1. **main**: One Producer, One Broker, One Consumer

   ![main branch](./images/kafka_main.png)

---

## How to Run

In the root path,

```bash
docker compose up
```

It will start all the containers needed and create topic "my-topic".

**The main branch doesn't run producer and consumer server with the docker compose file**. You should run Spring Boot applications on your own with the preferred tools(IDEs, bash, etc).

To test the how main branch works,

```bash
curl http://localhost:8080/send?message=hello
```

This should return "ok".