package com.ram.springboot.dao;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String msg){
        super(msg);
    }

    public EmployeeNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}
