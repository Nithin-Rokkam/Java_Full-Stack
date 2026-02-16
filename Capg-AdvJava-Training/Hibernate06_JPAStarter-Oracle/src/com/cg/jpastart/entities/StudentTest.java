package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		System.out.print("Enter the name: ");
		student.setName(sc.next());
		System.out.print("Enter the id: ");
		student.setStudentId(sc.nextInt());
		
		em.persist(student);// ->Hibernate sesson.save(student)  -> JDBC: stmt.executeUpdate(student)
		
		em.getTransaction().commit();
		
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
		sc.close();
	}
}
