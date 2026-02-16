package com.capg.hibernate;

import java.util.Scanner;

public class EmployeeController {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Employee ID");
            int empId = sc.nextInt();

            System.out.println("Enter Employee Name");
            String empName = sc.next();

            System.out.println("Enter Salary");
            double salary = sc.nextDouble();

            EmployeeService employeeService = new EmployeeService();
            int t = employeeService.addEmployee(empId, empName, salary);

            System.out.println("EmployeeController return value for db  :" + t);
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}