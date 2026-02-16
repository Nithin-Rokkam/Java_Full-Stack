package com.capg.hibernate;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Employee {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate_annotation.cfg.xml").buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		try {
			EmployeeBean employee=new EmployeeBean();
			employee.setFirstName("Nithin");
			employee.setLastName("Kumar");
			employee.setSalary(50000);
			session.save(employee);
			txn.commit();
		}catch(Exception e) {
			txn.rollback();
			System.out.println("Exception while creating employee:" +e);
			e.printStackTrace();
		}
		session.close();
	}
	
}
