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

# Run with docker server
```
docker run -itd --rm -p 8070:8070 --name tssa_app --env-file ./tssa.env elleined/tssa
```

# Run with docker compose 
```
docker compose --env-file ./tssa.env up
```

# Check API with Postman
[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://app.getpostman.com/run-collection/26932885-98e5b159-ec98-4ee3-b641-ef0e870a87c9?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D26932885-98e5b159-ec98-4ee3-b641-ef0e870a87c9%26entityType%3Dcollection%26workspaceId%3D80239089-b12c-4e34-8cc3-09285209eba5)

# Usefull links
- Create twilio account: https://www.javadream.in/twilio-java-api-twilio-send-sms-with-spring-boot/
- Demo: https://youtu.be/lJxjTLU9pGs
  
