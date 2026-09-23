FROM eclipse-temurin:25-jdk

COPY target/seMethod-0.1.0.2-jar-with-dependencies.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]