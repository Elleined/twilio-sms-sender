package com.elleined.twiliosmssender.controller;

import com.elleined.twiliosmssender.dto.MessageDTO;
import com.elleined.twiliosmssender.service.SMSService;
import jakarta.validation.Valid;
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
    public String message(@Valid @RequestBody MessageDTO messageDTO) {
        return smsService.message(messageDTO);
    }
}
