FROM openjdk:11
EXPOSE 8080
ADD target/projectcv-spring-image.jar projectcv-spring-image.jar
ENTRYPOINT ["java", "-jar", "/projectcv-spring-image.jar"]