package com.example.carrental.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends BaseModel{
    @ManyToOne
    private User user;
    @ManyToOne
    private Car car;
    private Date pickupTime;
    private int numberOfDays;
    private double expectedAmount;
}
