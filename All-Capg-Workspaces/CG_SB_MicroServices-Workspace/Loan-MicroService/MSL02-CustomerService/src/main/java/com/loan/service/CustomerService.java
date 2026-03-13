package com.loan.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.loan.entity.Customer;

public interface CustomerService {
	
	public Customer createCustomer(Customer customer);
	
	public Customer getCustomerById(int customerId);
	
	public List<Customer> getAllCustomers();
	
	public void deleteCustomer(int customerId);
	
	public ResponseEntity<?> getCutomerProfile(int customerId);
}
