package com.hibernate.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernate.entity.Product;

public class ProductService {

    private EntityManager em;

    public ProductService(EntityManager em) {
        this.em = em;
    }

    public void addProduct(String name, double price) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        em.persist(p);
        tx.commit();
    }
}