package org.example;

import org.example.factory.EmployeeDashBoard;
import org.example.factory.EmployeeDashBoardImpl;
import org.example.model.Employee;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.UUID;

public class App
{
    private static Scanner scanner=new Scanner(System.in);
    private static EmployeeDashBoard dashBoard;
    static
    {
        dashBoard=new EmployeeDashBoardImpl();
    }
    public static void main( String[] args )
    {
        int choice=0;
        do {


            String firstName, lastName, email = null;
            System.out.println("1. Create An Employee");
            System.out.println("2: Display All Employees");
            System.out.println("0:Exit");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    firstName = scanner.next();
                    System.out.print("Last Name: ");
                    lastName = scanner.next();
                    System.out.print("Email: ");
                    email = scanner.next();
                    Employee employee = dashBoard.createEmployee(new Employee(UUID.randomUUID().toString(),
                            firstName, lastName, email));
                    System.out.println("Employee Added Successfully" + employee);
                    break;
                case 2:
                    Collection<Employee> employees = dashBoard.getAllEmployees();
                    Iterator<Employee> iterator = employees.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    break;
                case 0:
                    System.out.println("Bye!!!");
                    System.exit(0);


            }
        }while (choice!=0);
    }
}
