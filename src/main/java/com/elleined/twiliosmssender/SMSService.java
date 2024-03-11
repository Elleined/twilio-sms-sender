package com.elleined.twiliosmssender;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SMSService {

    private final PhoneNumber twilioNumber;

    public SMSService(@Value("${SID}") String sid,
                      @Value("${AUTH_TOKEN}") String authToken,
                      @Value("${NUMBER}") String twilioNumber) {
        this.twilioNumber = new PhoneNumber(twilioNumber);

        log.info("Account sid {}", sid);
        log.info("Account Auth token {}", authToken);
        log.info("Twilio number {}", twilioNumber);
        log.warn("!!!NOTE: If you see one of the fields are blank or null there must be something wrong in your application.properties!!!");
        Twilio.init(sid, authToken);
    }

    public String message(MessageDTO messageDTO) {
        PhoneNumber receiver = new PhoneNumber(messageDTO.receiverNumber());
        Message message = Message.creator(receiver, twilioNumber, messageDTO.body()).create();
        log.info("Message status {}", message.getStatus());
        return "SMS Sent successfully to " + receiver;
    }
}
