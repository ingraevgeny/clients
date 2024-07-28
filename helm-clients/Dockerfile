FROM dock999evg/alp-ja:net
VOLUME /tmp
COPY maven/clients-jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]