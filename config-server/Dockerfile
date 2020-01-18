FROM openjdk:8-jdk-alpine

RUN apk update && \
      apk add sudo && \
      apk add bash

ARG JAR_FILE=target/spring-cloud-config-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} config-server.jar

COPY ./wait-for-it.sh wait-for-it.sh
RUN sudo chmod +x wait-for-it.sh

CMD ["./wait-for-it.sh" , "10.0.75.1:5672" , "--strict" , "--timeout=60" , "--" , "java", "-jar", "/config-server.jar"]
