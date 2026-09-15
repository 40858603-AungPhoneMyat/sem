FROM bellsoft/liberica-openjdk-debian:26
COPY ./target/classes /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "com.napier.sem.App"]