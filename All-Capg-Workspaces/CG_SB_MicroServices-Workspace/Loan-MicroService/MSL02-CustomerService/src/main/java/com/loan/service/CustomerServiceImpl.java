package com.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loan.entity.Customer;
import com.loan.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer createCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer getCustomerById(int customerId) {
		return repo.findById(customerId).get();
	}

	@Override
	public List<Customer> getAllCustomers() {		
		return repo.findAll();
	}

	@Override
	public void deleteCustomer(int customerId) {
		repo.deleteById(customerId);
	}

	@Override
	public ResponseEntity<?> getCutomerProfile(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
