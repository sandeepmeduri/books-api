FROM openjdk:8-jdk-alpine
RUN rm -rf /usr/src/app
WORKDIR /usr/src/app
EXPOSE 8082
ENTRYPOINT java -jar /usr/src/app/Books-0.0.1-SNAPSHOT.jar