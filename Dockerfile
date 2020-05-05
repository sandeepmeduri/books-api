FROM openjdk:8-jdk-alpine
EXPOSE 8082
RUN rm -rf /usr/src/app
WORKDIR /usr/src/app
COPY . .
RUN pwd
RUN ls
EXPOSE 8082
ENTRYPOINT java -jar /usr/src/app/target/Books-0.0.1-SNAPSHOT.jar