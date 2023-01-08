FROM eclipse-temurin:11-jdk
MAINTAINER jossemar.com
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} card-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/card-microservice-0.0.1-SNAPSHOT.jar"]