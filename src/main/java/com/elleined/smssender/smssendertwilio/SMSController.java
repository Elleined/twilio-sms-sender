package com.elleined.smssender.smssendertwilio;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class SMSController {
    private final SMSService smsService;

    @PostMapping("/sendSMS")
    public ResponseEntity<String> sendSMS(@RequestBody MessageDTO messageDTO) {
        String responseMessage = smsService.sendSMS(messageDTO);
        return ResponseEntity.accepted().body(responseMessage);
    }
}
