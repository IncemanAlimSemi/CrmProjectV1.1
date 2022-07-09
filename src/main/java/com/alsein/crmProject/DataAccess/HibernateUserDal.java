/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alsein.crmProject.DataAccess;

import com.alsein.crmProject.Entities.User;
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
public class HibernateUserDal implements IUserDal {
    
    private EntityManager entityManager;
    
    @Autowired
    public HibernateUserDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }    
    
    @Override
    @Transactional
    public List<User> getAll(){
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("FROM User", User.class).getResultList();
    }
}
