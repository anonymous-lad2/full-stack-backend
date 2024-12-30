package com.codewithme.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(int id){
        super("Could not find user with id - " +id);
    }
}
