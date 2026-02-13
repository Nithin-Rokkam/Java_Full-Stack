package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx1 {
	public static void main(String[] args) {
		Connection conn=null;
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String userName="capgdb";
		String password="capgdb";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,userName,password);
			String query="insert into Employeesinfo2 values(?,?,?)";
			try {
				PreparedStatement pstmt=conn.prepareStatement(query);
				pstmt.setInt(1,555);
				pstmt.setString(2,"Babu");
				pstmt.setDouble(3,9999.66);
				int i=pstmt.executeUpdate();
				System.out.println("First insertion done:"+i);
				pstmt.setInt(1,23);
				pstmt.setString(2,"Babu21");
				pstmt.setDouble(3,9923.66);
				int i2=pstmt.executeUpdate();
				System.out.println("Second insertion done:"+i2);
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
