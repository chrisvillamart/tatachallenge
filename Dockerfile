FROM maven:3.6.3-jdk-11-slim AS builder

COPY . /app

WORKDIR /app

RUN mvn clean install


FROM openjdk:11.0.12-jdk
COPY --from=builder /app/target/tatachallenge-1.0-SNAPSHOT.jar /app/tatachallenge-1.0-SNAPSHOT.jar
EXPOSE 8080
WORKDIR /app

CMD ["java", "-jar", "tatachallenge-1.0-SNAPSHOT.jar"]

 