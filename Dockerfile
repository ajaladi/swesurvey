FROM openjdk:17
COPY /target/swesurvey.jar swesurvey.jar
ENTRYPOINT ["java", "-jar", "/swesurvey.jar"]
EXPOSE 8080