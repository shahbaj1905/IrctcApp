package com.naushad.IrctcApp.model.exception;

public class InvalidPNRException extends RuntimeException{
    public InvalidPNRException(String msg){
        super(msg);
    }
}
