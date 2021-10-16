FROM openjdk:11
ARG JAVA_FILE=target/*.jar
COPY ${JAVA_FILE} department-service.jar
ENTRYPOINT ["java", "-jar", "/department-service.jar"]
EXPOSE 9001