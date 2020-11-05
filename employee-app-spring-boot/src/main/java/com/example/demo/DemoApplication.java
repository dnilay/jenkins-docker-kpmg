package com.example.demo;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.data.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private EmployeeDao employeeDao;

	@Autowired
	public DemoApplication(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		employeeDao.save(new Employee(1,"John","Doe","john@luv2code.com"));
		employeeDao.save(new Employee(2,"Marry","Public","marry@luv2code.com"));
	}
}
