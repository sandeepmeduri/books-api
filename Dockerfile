FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/book-service.jar /app/book-service.jar
ENTRYPOINT java -jar /app/book-service.jar