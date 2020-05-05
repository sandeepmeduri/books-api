FROM openjdk:8-jdk-alpine
EXPOSE 8082
ENTRYPOINT java -jar /home/ec2-user/app/Books-0.0.1-SNAPSHOT.jar