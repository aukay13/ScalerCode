package com.example.carrental.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoCarFound extends RuntimeException{

    public NoCarFound(){

    }

    public NoCarFound(String msg){
        super(msg);
    }
}
