package com.hibernate.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernate.entity.Customer;
import com.hibernate.entity.Order;
import com.hibernate.entity.Product;

public class OrderService {

    private EntityManager em;

    public OrderService(EntityManager em) {
        this.em = em;
    }

    public void placeOrder(Long customerId, List<Long> productIds) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Customer c = em.find(Customer.class, customerId);
        Order o = new Order();
        o.setCustomer(c);
        o.setOrderDate(new Date());

        double total = 0;
        for (Long id : productIds) {
            Product p = em.find(Product.class, id);
            o.getProducts().add(p);
            total += p.getPrice();
        }

        o.setTotalAmount(total);
        em.persist(o);
        tx.commit();
    }
}