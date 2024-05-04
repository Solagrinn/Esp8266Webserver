package com.example.esp8266webserver.Model;


import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor

public class Board {

    private Map<String, Pin> pins = new HashMap<>();
    public Board() {
        pins.put("1", new Pin("1","0","D0"));
        pins.put("2", new Pin("2","0","D1"));
        pins.put("3", new Pin("3","0","D2"));
        pins.put("4", new Pin("4","0","D3"));
        pins.put("5", new Pin("5","0","D4"));
        pins.put("6", new Pin("6","0","3v"));
        pins.put("7", new Pin("7","0","G"));
        pins.put("8", new Pin("8","0","D5"));
        pins.put("9", new Pin("9","0","D6"));
        pins.put("10", new Pin("10","0","D7"));
        pins.put("11", new Pin("11","0","D8"));
        pins.put("12", new Pin("12","0","RX"));
        pins.put("13", new Pin("13","0","TX"));
        pins.put("14", new Pin("14","0","G"));
        pins.put("15", new Pin("15","0","3.3v"));

    }



}
