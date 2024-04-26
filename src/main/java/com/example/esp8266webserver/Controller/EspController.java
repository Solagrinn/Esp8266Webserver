package com.example.esp8266webserver.Controller;

import com.example.esp8266webserver.DTOs.PinRequest;
import com.example.esp8266webserver.Model.Board;
import com.example.esp8266webserver.Model.Pin;
import com.example.esp8266webserver.Service.EspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EspController {

    @Autowired
    private EspService espService;


    @PostMapping("/savetoboard")
    public String pinPostRequest(@RequestBody PinRequest requestBody) {

        Pin pin = new Pin(requestBody.getId(), requestBody.getValue(), "");


        espService.savePinToBoard(pin);


        System.out.println("received POST");
        return "Data sent to ESP8266. Response: ";
    }

    @GetMapping("/savetoboard")
    public String receiveDataFromEsp() {


        System.out.println("received GET");
        return "received Get request";
    }
    @GetMapping("/getboard")
    public Board sendBoardData(){

        return espService.getBoard();
    }
    @GetMapping("/getboardjson")
    public List<Pin> sendBoardDataString(){
        return espService.getBoardPins();
    }






}
