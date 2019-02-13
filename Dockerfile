FROM openjdk:8u111-jdk-alpine

# Default Environment
ARG DB_HOST=127.0.0.1:3306
ARG DB_NAME=kdbname
ARG DB_USER=kdbuser
ARG DB_PASSWORD=kdbpass

# Dynamic Environment
ENV DB_HOST=$DB_HOST \
  DB_NAME=$DB_NAME \
  DB_USER=$DB_USER \
  DB_PASSWORD=$DB_PASSWORD

VOLUME /tmp

EXPOSE 8080
ADD /target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
