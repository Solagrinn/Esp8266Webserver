package com.example.esp8266webserver.Service;
import com.example.esp8266webserver.DTOs.BoardResponse;
import com.example.esp8266webserver.Model.Board;
import com.example.esp8266webserver.Model.BoardInterface;
import com.example.esp8266webserver.Model.Pin;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Getter
@Service
public class EspService implements BoardInterface {

    public Board board = createBoard();


    public Pin getPinById(String key) {

        return board.getPins().get(key);
    }

    public void savePinToBoard(Pin pin) {

        getPinById(pin.getId()).setPinName(getPinById(pin.getId()).getPinName());
        getPinById(pin.getId()).setValue(pin.getValue());
        getPinById(pin.getId()).setId(pin.getId());


        System.out.println(getPinById(pin.getId()));

    }

    public List<Pin> getBoardPins() {

        return new ArrayList<>(board.getPins().values());
    }

    public BoardResponse addTimeToResponse() {

        BoardResponse boardResponse = new BoardResponse();
        boardResponse.setBoardList(getBoardPins());

        boardResponse.setTime(Instant.now().toString());

        return boardResponse;
    }


    @Override
    public Board createBoard() {
        return new Board();
    }
}
