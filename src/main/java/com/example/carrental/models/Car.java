package com.example.carrental.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
public class Car extends BaseModel{

    @Column(name = "carname")
    private String name;
    private String brand;
    @Column(name = "makeyear")
    private int year;
    private double mileage;
    private double dailyCost;
    private String licenceNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "availabilitystatus")
    private Availability status;
    @Enumerated(EnumType.STRING)
    @Column(name = "cartype")
    private Cartype type;
}
