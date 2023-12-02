FROM openjdk:17
COPY swesurvey.jar swesurvey.jar
ENTRYPOINT ["java", "-jar", "/swesurvey.jar"]
EXPOSE 8080