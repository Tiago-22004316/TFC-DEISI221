FROM openjdk:11-jdk-slim

WORKDIR /app
COPY ./target/trabalho-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "trabalho-0.0.1-SNAPSHOT.jar"]