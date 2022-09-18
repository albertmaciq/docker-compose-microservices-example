FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/module-b-2.6.0.jar
ADD ${JAR_FILE} module-b.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/module-b.jar"]


