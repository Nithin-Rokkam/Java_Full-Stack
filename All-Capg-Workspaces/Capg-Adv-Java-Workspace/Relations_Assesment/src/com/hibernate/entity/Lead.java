package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LEAD")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lead_seq")
    @SequenceGenerator(name = "lead_seq", sequenceName = "LEAD_SEQ", allocationSize = 1)
    private Long id;

    private String name;
    private String source;
    private String contactInfo;

    @ManyToOne
    private SalesEmployee employee;

    public Lead() {}

    public void setName(String name) { this.name = name; }
    public void setSource(String source) { this.source = source; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
    public void setEmployee(SalesEmployee employee) { this.employee = employee; }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getSource() {
		return source;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public SalesEmployee getEmployee() {
		return employee;
	}
}