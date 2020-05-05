FROM openjdk:8-jdk-alpine
EXPOSE 8082
COPY /app/Books-0.0.1-SNAPSHOT.jar /home/app/Books-0.0.1-SNAPSHOT.jar
ENTRYPOINT java -jar /home/app/Books-0.0.1-SNAPSHOT.jar