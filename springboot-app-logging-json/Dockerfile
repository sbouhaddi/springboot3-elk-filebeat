FROM openjdk:17-alpine

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS

VOLUME /tmp

COPY target/*.jar app.jar
RUN sh -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
