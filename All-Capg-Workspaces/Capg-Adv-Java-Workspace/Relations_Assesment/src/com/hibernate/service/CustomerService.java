package com.hibernate.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernate.entity.Address;
import com.hibernate.entity.Customer;

public class CustomerService {

    private EntityManager em;

    public CustomerService(EntityManager em) {
        this.em = em;
    }

    public void registerCustomer(String name, String email, String phone) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer c = new Customer();
        c.setName(name);
        c.setEmail(email);
        c.setPhone(phone);
        em.persist(c);
        tx.commit();
    }

    public void addAddressToCustomer(Long id, Address address) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Customer c = em.find(Customer.class, id);
        c.setAddress(address);
        tx.commit();
    }
}