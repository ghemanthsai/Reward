FROM eclipse-temurin:17
WORKDIR /app
COPY target/retailer-rewards-0.0.1-SNAPSHOT.jar /app/retailer-rewards-0.0.1.jar
ENTRYPOINT ["java", "-jar", "retailer-rewards-0.0.1.jar"]