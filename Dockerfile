FROM ubuntu:18.04

RUN apt-get update && apt-get install -y \
apt-utils \
openjdk-11-jdk

RUN mkdir -p /var/poc/
COPY ./target/spring-boot-api-docker-poc-1.0-SNAPSHOT.jar /var/poc/
WORKDIR /var/poc

EXPOSE 9595

CMD ["java","-jar","/var/poc/spring-boot-api-docker-poc-1.0-SNAPSHOT.jar"]
