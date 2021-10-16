FROM openjdk:11
ARG JAVA_FILE=target/*.jar
COPY ${JAVA_FILE} gateway-service.jar
ENTRYPOINT ['java', '-jar', 'gateway-service.jar']
EXPOSE 9003