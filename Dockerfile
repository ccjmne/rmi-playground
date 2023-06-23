FROM eclipse-temurin:20

COPY out/Server.jar .

CMD ["java", "-jar", "Server.jar"]
