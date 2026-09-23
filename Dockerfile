FROM eclipse-temurin:25-jdk

COPY target/seMethod-0.1.0.2-jar-with-dependencies.jar /tmp/

WORKDIR /tmp

ENTRYPOINT ["java", "-jar", "seMethod-0.1.0.2-jar-with-dependencies.jar"]