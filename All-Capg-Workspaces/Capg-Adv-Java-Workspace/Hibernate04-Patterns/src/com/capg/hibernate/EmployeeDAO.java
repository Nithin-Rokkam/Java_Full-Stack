package com.capg.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    int i;

    public int addEmployee(EmployeeBean employeeBean) throws ClassNotFoundException {

        System.out.println("Employee DAO Layer");
        System.out.println("EmpID :" + employeeBean.getEmpId());
        System.out.println("EmpName :" + employeeBean.getEmpName());
        System.out.println("Salary :" + employeeBean.getSalary());

        try {
            Connection conn = null;

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String driver = "oracle.jdbc.driver.OracleDriver";
            String userName = "capgdb";
            String password = "capgdb";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, password);

            String query = "insert into employee values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, employeeBean.getEmpId());
            pstmt.setString(2, employeeBean.getEmpName());
            pstmt.setDouble(3, employeeBean.getSalary());

            i = pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return i;
    }
}