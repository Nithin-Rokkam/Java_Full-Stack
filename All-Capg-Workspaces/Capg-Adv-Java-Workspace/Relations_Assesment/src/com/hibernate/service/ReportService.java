package com.hibernate.service;

import javax.persistence.EntityManager;

public class ReportService {

    private EntityManager em;

    public ReportService(EntityManager em) {
        this.em = em;
    }

    public Long getEmployeePerformance(Long empId) {
        return em.createQuery(
            "select count(l) from Lead l where l.employee.id = :id",
            Long.class
        ).setParameter("id", empId).getSingleResult();
    }
}