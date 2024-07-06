FROM openjdk:17-alpine
MAINTAINER Elleined

ENV PORT=8070

ADD /target/*.jar twilio-sms-sender-api.jar
EXPOSE 8070
CMD ["java", "-jar", "twilio-sms-sender-api.jar"]