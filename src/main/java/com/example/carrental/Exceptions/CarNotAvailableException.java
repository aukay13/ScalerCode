package com.example.carrental.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CarNotAvailableException extends RuntimeException{

    public CarNotAvailableException(){

    }

    public CarNotAvailableException(String msg){
        super(msg);
    }
}
