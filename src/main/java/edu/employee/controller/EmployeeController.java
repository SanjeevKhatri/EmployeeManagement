package edu.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final String GET_EMPLOYEE = "/employee";

    @GetMapping(GET_EMPLOYEE)
    public String getEmployee() {
        System.out.println("I'm here");
        return "I'm here";
    }
}
