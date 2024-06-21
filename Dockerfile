FROM openjdk:21
EXPOSE 8080
ADD target/jenkinstestproject-0.0.1-SNAPSHOT.jar demo-app.jar
ENTRYPOINT ["java","-jar","/demo-app.jar"]