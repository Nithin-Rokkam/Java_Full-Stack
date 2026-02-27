package com.capg.spring;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

    public static void main(String[] args) {

        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("applicationContext_Dao.xml");

        EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {

            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Update Employee Name");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Emp No: ");
                    int empNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    dao.save(new EmployeeBean(name, empNo, dept, email));
                    break;

                case 2:
                    System.out.print("Emp No: ");
                    EmployeeBean emp = dao.get(sc.nextInt());
                    System.out.println(emp == null ? "Not Found" : emp);
                    break;

                case 3:
                    System.out.print("Emp No: ");
                    dao.removeEmployee(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Emp No: ");
                    int eno = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    dao.updateEmployeeName(eno, sc.nextLine());
                    break;

                case 5:
                    flag = false;
            }
        }
        sc.close();
    }
}