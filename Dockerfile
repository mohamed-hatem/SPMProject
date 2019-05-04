FROM alpine/git as clone 
WORKDIR /app
RUN git clone https://github.com/mohamed-hatem/SPMProject.git

FROM maven:3.5-jdk-8-alpine as build 
WORKDIR /app
COPY --from=clone /app/SPMProject /app 
RUN mvn install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/SPMProject-0.0.1-SNAPSHOT.jar /app
CMD ["java -jar spring-petclinic-1.5.1.jar"]