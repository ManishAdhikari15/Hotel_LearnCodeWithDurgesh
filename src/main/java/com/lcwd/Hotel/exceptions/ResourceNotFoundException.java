package com.lcwd.Hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("resource not found ");
    }

    public ResourceNotFoundException(String messsage){
        super(messsage);
    }
}
