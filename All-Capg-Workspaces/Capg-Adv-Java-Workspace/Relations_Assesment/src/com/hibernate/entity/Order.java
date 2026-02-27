package com.hibernate.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ord_seq")
    @SequenceGenerator(name = "ord_seq", sequenceName = "ORD_SEQ", allocationSize = 1)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private double totalAmount;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    @JoinTable(
        name = "ORDERS_PRODUCT",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

    public Order() {}

    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public List<Product> getProducts() { return products; }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}