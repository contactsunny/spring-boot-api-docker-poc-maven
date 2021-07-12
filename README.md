# Spring Boot API - Docker POC
This project demonstrates how to Dockerize a Spring Boot API project. This project uses Spring Boot 2.2.5-SNAPSHOT version.
Also, this is a Gradle project. You can check the ```build.gradle``` file for more info. Also, take a look at the 
```Dockerfile``` file for information on how to configure Docker for such a project.

## How to Build
Once you clone the repository, ```cd``` into the project root directory and run the following command to build the project:

```shell script
mvn clean install
```

## How to Run
Once you build the project, the ```build``` command will generate a ```.jar``` file in the ```build/libs/``` directory.
The name of the ```.jar``` file will be ```spring-boot-api-docker-poc-1.0-SNAPSHOT.jar```. You can run this project
by executing the following command from the project root directory:

```shell script
java -jar target/spring-boot-api-docker-poc-1.0-SNAPSHOT.jar
```

## Port Configuration
By default, the project is configured to listen on port ```9595```. You can change this by editing the ```server.port``` 
property in the ```resources/application.properties``` file. If you do so, make sure you expose the same port in the 
```Dockerfile``` as well.

## Building the Docker Image
To build the Docker image for this project, from the project root directory, run the following command:

```shell script
docker build -t poc/spring-boot-api-docker-poc .
```

Wait for the command to download all necessary packages required to create the image. Once the image is build, you can
execute the following command to run the Docker image and the web app inside the container:

```shell script
docker run -it -p 127.0.0.1:9595:9595 poc/spring-boot-api-docker-poc
```