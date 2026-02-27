package com.capg.spring;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

    private String name;
    private int empNo;
    private String department;
    private String email;

    public EmployeeBean() {}

    public EmployeeBean(String name, int empNo, String department, String email) {
        this.name = name;
        this.empNo = empNo;
        this.department = department;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", empNo=" + empNo +
               ", department=" + department + ", email=" + email + "]";
    }
}