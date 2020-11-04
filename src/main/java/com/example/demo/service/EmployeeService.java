package com.example.demo.service;

import com.example.demo.data.Employee;

import java.util.Optional;

public interface EmployeeService {


    public Iterable<Employee> getAllEmployees();

    public Optional<Employee> createEmployee(Employee employee);

}
