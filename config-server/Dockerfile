FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/spring-cloud-config-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} config-server.jar

ENTRYPOINT ["java", "-jar", "/config-server.jar"]