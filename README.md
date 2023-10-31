# twilio-sms-sender-api
Sending text message using spring boot with twilio

# How to run this project 
  - First create a twilio refer to the provided links below on how to create twilio account.
  - Second supply the appropriate values specified in application.properties file and everything should works fine
  - And hit the this endpoint with request body of
  ```
    POST http://localhost:{postNumber}/twillio/sendSMS
    Content-Type: application/json

    {
      "receiverNumber": "+639#######",
      "body": "Your message"
    }
  ```
  // Use the appropriate country code. For me in Philippines its +63
  
# How many sms can you send using twilio 
 - Twilio Trail account only last for 45 days
 - After this free Trail credit reaches to zero that will be your limit
   
![image](https://github.com/Elleined/twilio-sms-sender/assets/111877930/136b2a27-5769-4e85-829c-9b2f0ad2fee0)

# Usefull links
- Create twilio account: https://www.javadream.in/twilio-java-api-twilio-send-sms-with-spring-boot/
- Demo: https://youtu.be/lJxjTLU9pGs
  
