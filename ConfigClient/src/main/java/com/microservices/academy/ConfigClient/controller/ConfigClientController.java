package com.microservices.academy.ConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${employee.salary}")
    private String salary;
    @Value("${database.env}")
    private String dbenvironment;

    @RequestMapping("/employee/salary")
    public String home() {
        return "The employee salary in "+ dbenvironment+" is: "+salary+ " pesos mensuales." ;
    }
}
