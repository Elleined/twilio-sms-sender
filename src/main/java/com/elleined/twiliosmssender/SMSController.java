package com.elleined.twiliosmssender;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/messaging")
public class SMSController {
    private final SMSService smsService;

    @PostMapping
    public ResponseEntity<String> message(@RequestBody MessageDTO messageDTO) {
        String responseMessage = smsService.message(messageDTO);
        return ResponseEntity.accepted().body(responseMessage);
    }
}
