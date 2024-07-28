FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY maven/clients-jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]