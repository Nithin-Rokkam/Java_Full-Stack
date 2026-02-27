package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	
     private String name;
	
     /*students table will have a column ADDRESS_ID

		ADDRESS_ID is a foreign key
		
		It points to Address.ADDRESS_ID
		
		Only Student knows about Address
		
		Address does NOT know about Student*/
	 @OneToOne(cascade=CascadeType.ALL)
	 
	 @JoinColumn(name = "ADDRESS_ID")//foreign key
	 private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
