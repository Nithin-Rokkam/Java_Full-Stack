package com.capg.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

public class EmployeeDaoImpl implements EmployeeDao {

    private DataSource dataSource;

    public EmployeeDaoImpl() {}

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(EmployeeBean bean) {

        String sql =
            "INSERT INTO MYEMPLOYEE (EMPNO, ENAME, DEPARTMENT, 	EMAIL) VALUES (?,?,?,?)";

        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, bean.getEmpNo());
            ps.setString(2, bean.getName());
            ps.setString(3, bean.getDepartment());
            ps.setString(4, bean.getEmail());

            ps.executeUpdate();
            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public EmployeeBean get(int empNo) {

        EmployeeBean emp = null;

        try (Connection con = dataSource.getConnection();
             Statement st = con.createStatement();
             ResultSet rs =
                 st.executeQuery(
                     "SELECT * FROM MYEMPLOYEE WHERE EMPNO=" + empNo)) {

            if (rs.next()) {
                emp = new EmployeeBean();
                emp.setEmpNo(rs.getInt("EMPNO"));
                emp.setName(rs.getString("ENAME"));
                emp.setDepartment(rs.getString("DEPARTMENT"));
                emp.setEmail(rs.getString("EMAIL"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public int removeEmployee(int empNo) {

        int res = 0;

        try (Connection con = dataSource.getConnection();
             Statement st = con.createStatement()) {

            res = st.executeUpdate(
                "DELETE FROM MYEMPLOYEE WHERE EMPNO=" + empNo);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public int updateEmployeeName(int empNo, String newName) {

        int res = 0;

        try (Connection con = dataSource.getConnection();
             PreparedStatement ps =
                 con.prepareStatement(
                     "UPDATE MYEMPLOYEE SET ENAME=? WHERE EMPNO=?")) {

            ps.setString(1, newName);
            ps.setInt(2, empNo);

            res = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}