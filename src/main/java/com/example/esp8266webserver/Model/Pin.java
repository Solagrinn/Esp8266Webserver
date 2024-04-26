package com.example.esp8266webserver.Model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Pin {
    @Id

    private String id;

    private String value;

    private String pinName;



}
