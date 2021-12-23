FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/module-b-2.6.0.jar
ADD ${JAR_FILE} module-b.jar
ENTRYPOINT ["java","-jar","/module-b.jar"]


