package com.example.esp8266webserver.DTOs;
import com.example.esp8266webserver.Model.Pin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class BoardResponse {
    private List<Pin> boardList;

    private String time;
}
