FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/learning-spring-boot-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} learning-spring-boot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/learning-spring-boot.jar"]