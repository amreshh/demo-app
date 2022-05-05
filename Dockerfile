FROM docker.io/openjdk:8-jre-alpine

ENV DEVOTEAM=https://nl.devoteam.com/
ENV ITECH=https://nl.devoteam.com/expertise/innovative-tech/
ENV EVENTS=https://nl.devoteam.com/event/
ENV CAREERS=https://nl.devoteam.com/working-at-devoteam/
ENV INSIGHTS=https://nl.devoteam.com/insights-events/

WORKDIR /app
ADD ./target/demo-app-*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]
