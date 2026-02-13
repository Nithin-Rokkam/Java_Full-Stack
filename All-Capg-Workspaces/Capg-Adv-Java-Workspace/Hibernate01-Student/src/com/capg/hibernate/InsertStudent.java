package com.capg.hibernate;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

public class InsertStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			Student s1=new Student();
			s1.setSno(1);
			s1.setSname("Nithin");
			s1.setEmail("nithin@gmail.com");
			s1.setMobile(12345678L);
			
			session.save(s1);
			
			Student s2=new Student();
			s2.setSno(2);
			s2.setSname("nani");
			s2.setEmail("nani@gmail.com");
			s2.setMobile(1234232L);
			
			session.save(s2);
			
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}

}
