package com.example.carrental.controllers;

import com.example.carrental.dtos.RentRequestDTO;
import com.example.carrental.dtos.RentResponseDTO;
import com.example.carrental.models.Ticket;
import com.example.carrental.services.RentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rent")
public class RentController {

    private RentService rs;

    public RentController(RentService rs) {
        this.rs = rs;
    }

    @PostMapping("/getRent")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody RentResponseDTO rentACar(@RequestBody RentRequestDTO reqDTO){
        Ticket t  = rs.rentCarMethod(reqDTO.getUserID(),reqDTO.getCarID(), reqDTO.getNumberOfDays());
        return RentResponseDTO.builder()
                .ticket_id(t.getId())
                .expectedAmount(t.getExpectedAmount())
                .car(t.getCar().getName())
                .userName(t.getUser().getFirstName())
                .build();
    }
}