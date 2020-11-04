package com.example.demo.rest;

import com.example.demo.data.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public ResponseEntity<Iterable<Employee>> getAllEmployees()
    {
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }
    @PostMapping("/employees")
    public  ResponseEntity<Optional<Employee>> createEmployee(@RequestBody Employee employee)
    {
        return  ResponseEntity.ok().body(employeeService.createEmployee(employee));
    }

}
