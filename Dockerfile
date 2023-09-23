# Base Image
FROM adoptopenjdk/openjdk11


ARG JAR_FILE_PATH=./build/libs/*.jar

COPY ${JAR_FILE_PATH} ttproject.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "ttproject.jar"]