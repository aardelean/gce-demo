FROM frolvlad/alpine-oraclejdk8:slim

EXPOSE 8003
ADD build/libs/gce-demo-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
