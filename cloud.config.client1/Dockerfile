FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/cloud.config.client1-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} client1.jar

ENTRYPOINT ["java", "-jar", "/client1.jar"]