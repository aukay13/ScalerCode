package com.example.carrental.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentResponseDTO {

    private long id;
    private double expectedAmount;
    private String car;
    private String userName;
}
