package org.example.factory;

import org.example.model.Employee;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class EmployeeDashBoardImpl implements EmployeeDashBoard{
    private Map<String,Employee> employeeMap;
    //constructor
    {
        employeeMap=new TreeMap<String,Employee>();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employeeMap.put(UUID.randomUUID().toString(),employee);
        return employee;
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        Collection<Employee> employees=employeeMap.values();
        return employees;
    }
}
