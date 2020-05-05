FROM openjdk:8-jdk-alpine
EXPOSE 8082
ENTRYPOINT java -jar /app/Books-0.0.1-SNAPSHOT.jar