package edu.employee.controller;

import edu.employee.domain.Employee;
import edu.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private final String GET_EMPLOYEE = "/employee";
    private final String POST_EMPLOYEE = "/addEmployee";
    private final String PUT_EMPLOYEE = "/updateEmployee";
    private final String DELETE_EMPLOYEE = "/deleteEmployee";

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(GET_EMPLOYEE)
    public Employee getEmployee(@RequestParam("employeeId") Long id) {
        return employeeService.getEmployee(id);
//        return Employee.builder()
//            .id(123L)
//            .emailAddress("abc@gmail.com")
//            .firstName("MyName")
//            .lastName("LastName")
//            .salary(100000.00)
//            .build();
    }

    @PostMapping(POST_EMPLOYEE)
    public Employee postEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping(PUT_EMPLOYEE)
    public Employee putEmployee(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping(DELETE_EMPLOYEE)
    public void deleteEmployee(@RequestParam("employeeId") Long id) {
        employeeService.delete(id);
    }
}
