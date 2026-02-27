package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPORT_TICKET")
public class SupportTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
    @SequenceGenerator(name = "ticket_seq", sequenceName = "TICKET_SEQ", allocationSize = 1)
    private Long id;

    private String issueDescription;

    @OneToOne
    private Order order;

    public SupportTicket() {}

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public Order getOrder() {
		return order;
	}
}