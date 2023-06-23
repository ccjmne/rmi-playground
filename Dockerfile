FROM eclipse-temurin:20

WORKDIR /home

COPY out/Server.jar .

CMD ["java", "-jar", "Server.jar"]
