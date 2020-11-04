package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.data.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Iterable<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Optional<Employee> createEmployee(Employee employee) {
        return Optional.of(employeeDao.save(employee));
    }
}
