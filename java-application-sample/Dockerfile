FROM openjdk:8
ARG JAR_NAME
ADD ${JAR_NAME} app.jar
RUN sh -c 'touch app.jar'
ENTRYPOINT ["java", "-jar", "app.jar"]