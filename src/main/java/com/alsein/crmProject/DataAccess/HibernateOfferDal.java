/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.DataAccess;

import com.alsein.crmProject.Entities.Offer;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alims
 */
@Repository
public class HibernateOfferDal implements IOfferDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateOfferDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
   
    @Override
    @Transactional
    public List<Offer> getAll() { 
        Session session = entityManager.unwrap(Session.class);
        List<Offer> offers = session.createQuery("FROM Offer", Offer.class).getResultList();
        return offers;
    }

    @Override
    @Transactional
    public Offer getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Offer offer = session.get(Offer.class, id);
        return offer;
    }

    @Override
    @Transactional
    public void add(Offer offer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(offer);
    }

    @Override
    @Transactional
    public void update(Offer offer) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(offer);
    }

    @Override
    @Transactional
    public void delete(Offer offer) {
        Session session = entityManager.unwrap(Session.class);
        Offer offerToDelete = session.get(Offer.class, offer.getId());
        session.delete(offerToDelete);
    }
}
