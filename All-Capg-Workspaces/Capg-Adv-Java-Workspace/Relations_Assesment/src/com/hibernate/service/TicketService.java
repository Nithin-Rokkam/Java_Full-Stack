package com.hibernate.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hibernate.entity.Order;
import com.hibernate.entity.SupportTicket;

public class TicketService {

    private EntityManager em;

    public TicketService(EntityManager em) {
        this.em = em;
    }

    public void raiseTicket(Long orderId, String issue) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Order o = em.find(Order.class, orderId);
        SupportTicket t = new SupportTicket();
        t.setOrder(o);
        t.setIssueDescription(issue);
        em.persist(t);
        tx.commit();
    }
}