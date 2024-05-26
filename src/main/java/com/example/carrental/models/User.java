package com.example.carrental.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "rental_users")
@Data
public class User extends BaseModel{

    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private Date dob;

}
