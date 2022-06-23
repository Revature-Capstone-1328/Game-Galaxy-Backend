FROM openjdk:8-jdk
EXPOSE 8087
COPY target/Game-Galaxy-Backend-0.0.1-SNAPSHOT.jar Game-Galaxy-Backend.jar
CMD ["java", "-jar", "Game-Galaxy-Backend.jar"]