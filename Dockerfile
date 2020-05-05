FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
COPY [/home/ec2-user, /opt]
ENTRYPOINT java -jar /opt/Books-0.0.1-SNAPSHOT.jar