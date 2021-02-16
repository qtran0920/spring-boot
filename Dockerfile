FROM openjdk:8u111-jdk-alpine
COPY build/libs/spring-boot-0.0.1-SNAPSHOT.jar /spring-boot.jar
EXPOSE 80 8080
ENTRYPOINT ["java","-jar","/spring-boot.jar"]
