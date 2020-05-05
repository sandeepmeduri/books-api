FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
RUN rm -rf /app
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
RUN wget --user=admin --password=LHYtb-JY_0jHhDh-Djo7zQ https://medursan.jfrog.io/artifactory/example-repo-local/com/infy/Books/0.0.1-SNAPSHOT/Books-0.0.1-SNAPSHOT.jar -P /app
ENTRYPOINT java -jar /app/Books-0.0.1-SNAPSHOT.jar