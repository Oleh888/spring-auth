FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#for starting app run in terminal:
#gradle clean build
#docker build -t spring-auth .
#docker run -p 8080:8080 spring-auth