package com.hibernate.service;

import com.hibernate.entity.*;
import javax.persistence.*;

public class LeadService {

    private EntityManager em;

    public LeadService(EntityManager em) {
        this.em = em;
    }

    public void createLead(String name, String source, String contact) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Lead l = new Lead();
        l.setName(name);
        l.setSource(source);
        l.setContactInfo(contact);
        em.persist(l);
        tx.commit();
    }

    public void assignLeadToEmployee(Long leadId, Long empId) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Lead l = em.find(Lead.class, leadId);
        SalesEmployee e = em.find(SalesEmployee.class, empId);
        l.setEmployee(e);
        tx.commit();
    }

    public void convertLeadToCustomer(Long leadId) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Lead l = em.find(Lead.class, leadId);
        Customer c = new Customer();
        c.setName(l.getName());
        c.setEmail(l.getContactInfo());
        em.persist(c);
        em.remove(l);
        tx.commit();
    }
}