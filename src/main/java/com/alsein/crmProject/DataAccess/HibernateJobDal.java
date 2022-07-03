/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.DataAccess;

import com.alsein.crmProject.Entities.Job;
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
public class HibernateJobDal implements IJobDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateJobDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
   
    @Override
    @Transactional
    public List<Job> getAll() { 
        Session session = entityManager.unwrap(Session.class);
        List<Job> jobs = session.createQuery("FROM Job", Job.class).getResultList();
        return jobs;
    }

    @Override
    @Transactional
    public Job getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Job job = session.get(Job.class, id);
        return job;
    }

    @Override
    @Transactional
    public void add(Job job) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(job);
    }

    @Override
    @Transactional
    public void update(Job job) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(job);
    }

    @Override
    @Transactional
    public void delete(Job job) {
        Session session = entityManager.unwrap(Session.class);
        Job jobToDelete = session.get(Job.class, job.getId());
        session.delete(jobToDelete);
    }
    
}
