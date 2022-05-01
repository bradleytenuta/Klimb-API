FROM amazoncorretto:17-alpine-jdk
ARG JAR_FILE=core/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# docker build -t klimb-api .
# docker run -p 8080:8080 klimb-api