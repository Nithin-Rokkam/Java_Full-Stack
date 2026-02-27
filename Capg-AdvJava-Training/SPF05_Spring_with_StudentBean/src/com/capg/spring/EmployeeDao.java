package com.capg.spring;

public interface EmployeeDao {

    void save(EmployeeBean bean);

    EmployeeBean get(int empNo);

    int updateEmployeeName(int empNo, String newName);

    int removeEmployee(int empNo);
}