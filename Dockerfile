FROM openjdk:17-alpine
MAINTAINER Elleined

ENV SID=to_be_supplied
ENV AUTH_TOKEN=to_be_supplied
ENV NUMBER=to_be_supplied

COPY /target/*.jar twilio-sms-sender-api.jar

CMD ["java", "-jar", "twilio-sms-sender-api.jar"]