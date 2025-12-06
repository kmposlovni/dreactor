FROM azul/zulu-openjdk-alpine:21-latest
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9999/tcp
ENTRYPOINT ["java","-jar","/app.jar"]
