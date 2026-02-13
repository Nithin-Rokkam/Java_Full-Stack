package com.capg.hibernate;

public class EmployeeService {

    public int addEmployee(int empId, String empName, double salary) throws ClassNotFoundException {

        EmployeeBean employeeBean = new EmployeeBean();
        employeeBean.setEmpId(empId);
        employeeBean.setEmpName(empName);
        employeeBean.setSalary(salary);

        EmployeeDAO employeeDAO = new EmployeeDAO();
        return employeeDAO.addEmployee(employeeBean);
    }
}