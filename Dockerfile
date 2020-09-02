FROM openjdk:14
ADD target/notification-service.jar notification-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","notification-service.jar"]