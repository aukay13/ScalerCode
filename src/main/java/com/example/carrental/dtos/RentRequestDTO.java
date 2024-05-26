package com.example.carrental.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentRequestDTO {
    private long userID;
    private long carID;
    private int numberOfDays;
}
