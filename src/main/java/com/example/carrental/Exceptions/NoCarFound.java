package com.example.carrental.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.concurrent.Semaphore;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoCarFound extends RuntimeException{

    public NoCarFound(){

    }

    public NoCarFound(String msg){
        super(msg);
    }
}
