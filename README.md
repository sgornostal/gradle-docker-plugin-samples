# gradle-docker-plugin samples

## java-application-sample
Docker integration with `application` plugin

Run `./gradlew :java-application-sample:runDocker` command to build and start container

The task will output:
```
Output environment var from docker container: My Variable
```

## java-webapp-sample
Docker integration with `war` plugin

Run `./gradlew :java-webapp-sample:runDocker` command to build and start container

The task should run docker container with tomcat and deploy war to it.
 
After docker is started go to `localhost:8080/webapp-sample/hello` in your browser to see output from servlet

Run `./gradlew :java-webapp-sample:stopDocker` command to stop container 
 
## spring-boot-sample
Docker integration with `spring-boot` plugin

Run `./gradlew :spring-boot-sample:runDocker` command to build and start container

The task should run docker container with spring boot application.
 
After docker is started go to `localhost:8080/hello` in your browser to see output from controller

Run `./gradlew :java-webapp-sample:stopDocker` command to stop container 