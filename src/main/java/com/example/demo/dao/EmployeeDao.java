package com.example.demo.dao;

import com.example.demo.data.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableTransactionManagement
public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
