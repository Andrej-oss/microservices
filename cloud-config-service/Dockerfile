FROM openjdk:11
ARG JAVA_FILE=target/*.jar
COPY ${JAVA_FILE} config-service.jar
ENTRYPOINT ['java', 'jar', 'config-service.jar']
EXPOSE 9010