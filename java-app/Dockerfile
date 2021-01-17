FROM gradle:jdk10 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

#FROM openjdk:8-jre-alpine
FROM openjdk:10-jre-slim
EXPOSE 8080
COPY --from=builder /home/gradle/src/build/libs/java-app-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app


ENTRYPOINT ["java", "-jar", "java-app-1.0-SNAPSHOT.jar"]
