package com.example.carrental.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoUserFound extends RuntimeException{

    public NoUserFound(){

    }

    public NoUserFound(String msg){
        super(msg);
    }
}
