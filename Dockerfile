FROM openjdk:17

COPY target/SpringSecurity-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "SpringSecurity-0.0.1-SNAPSHOT.jar"]