FROM openjdk:8-jdk-alpine

RUN apk update && \
      apk add sudo && \
      apk add bash

ARG JAR_FILE=target/cloud.config.client1-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} client1.jar

COPY ./wait-for-it.sh wait-for-it.sh
RUN sudo chmod +x wait-for-it.sh

CMD ["./wait-for-it.sh" , "10.0.75.1:8888" , "--strict" , "--timeout=60" , "--" , "java", "-jar", "/client1.jar"]
