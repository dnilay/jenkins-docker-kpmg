package org.example.factory;

import org.example.model.Employee;

import java.util.Collection;

public interface EmployeeDashBoard {

    public Employee createEmployee(Employee employee);
    public Collection<Employee> getAllEmployees();
}
