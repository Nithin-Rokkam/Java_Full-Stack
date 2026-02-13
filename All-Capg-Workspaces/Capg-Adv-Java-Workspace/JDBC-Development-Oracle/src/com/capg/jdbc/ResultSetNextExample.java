package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetNextExample {
	public static void main(String[] args) {
		Connection conn=null;
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String userName="capgdb";
		String password="capgdb";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,userName,password);
			try {
				Statement stmt=conn.createStatement();
				ResultSet res=stmt.executeQuery("Select * from Employeesinfo1");
				while(res.next()) {
					System.out.print(res.getInt(1)+"  ");
					System.out.print("Employee name:"+res.getString("ename")+"  ");
					System.out.println("Emp sal:"+res.getInt(3));
				}
			}catch(SQLException s) {
				System.out.println(s);
				s.printStackTrace();
			}
			conn.close();
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
//		Class.close();
	}
}
