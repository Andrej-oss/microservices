FROM openjdk:11
ARG JAVA_FILE=target/*.jar
COPY ${JAVA_FILE} register-service.jar
ENTRYPOINT ["java", "-jar", "/register-service.jar"]
EXPOSE 8761