package com.example.carrental.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Bill extends BaseModel{
    @OneToOne
    private Ticket ticket;
    private double actualAmount;
    private Date returnDate;
    private String paymentType;
}
