package com.example.carrental.services;

import com.example.carrental.exceptions.CarNotAvailableException;
import com.example.carrental.exceptions.NoCarFound;
import com.example.carrental.exceptions.NoUserFound;
import com.example.carrental.models.Availability;
import com.example.carrental.models.Car;
import com.example.carrental.models.Ticket;
import com.example.carrental.models.User;
import com.example.carrental.repository.CarRepository;
import com.example.carrental.repository.TicketRepository;
import com.example.carrental.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class RentService {

    private UserRepository ur;
    private CarRepository cr;
    private TicketRepository tr;

    public RentService(UserRepository ur, CarRepository cr, TicketRepository tr) {
        this.ur = ur;
        this.cr = cr;
        this.tr = tr;
    }

    public Ticket rentCarMethod(long userId, long carID, int days){
        Optional<User> u = ur.findById(userId);
        if(u.isEmpty()){
            throw new NoUserFound("User does not exist");
        }

        Optional<Car> c = cr.findById(carID);
        if(c.isEmpty()){
            throw new NoCarFound("Car not found");
        }

        if(c.get().getStatus().equals(Availability.RENTED)){
            throw new CarNotAvailableException("Car rented out");
        }

        c.get().setStatus(Availability.RENTED);
        cr.save(c.get());
        double amount = days*c.get().getDailyCost();

        Ticket t =  Ticket.builder()
                .user(u.get())
                .car(c.get())
                .numberOfDays(days)
                .expectedAmount(amount)
                .pickupTime(new Date())
                .build();
        tr.save(t);
        return t;
    }
}
