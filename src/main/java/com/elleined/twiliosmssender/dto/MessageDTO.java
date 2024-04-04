package com.elleined.twiliosmssender.dto;

import jakarta.validation.constraints.NotNull;

public record MessageDTO(

        @NotNull(message = "Please provide receiver number")
        String receiverNumber,

        @NotNull(message = "Please provide body")
        String body) { }
