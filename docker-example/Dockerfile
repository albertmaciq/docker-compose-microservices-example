FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/docker-example-2.6.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


