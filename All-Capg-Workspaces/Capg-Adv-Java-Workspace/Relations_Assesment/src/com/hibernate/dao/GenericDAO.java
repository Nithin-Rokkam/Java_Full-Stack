package com.hibernate.dao;

import javax.persistence.EntityManager;

public class GenericDAO {

    protected EntityManager em;

    public GenericDAO(EntityManager em) {
        this.em = em;
    }
}