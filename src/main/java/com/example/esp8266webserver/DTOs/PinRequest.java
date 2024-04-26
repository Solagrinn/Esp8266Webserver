package com.example.esp8266webserver.DTOs;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PinRequest {
    @Id
    private String id;

    private String value;


}
