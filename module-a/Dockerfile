FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/module-a-2.6.0.jar
ADD ${JAR_FILE} module-a.jar
ENTRYPOINT ["java","-jar","/module-a.jar"]


