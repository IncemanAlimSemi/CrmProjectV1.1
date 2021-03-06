/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Business;

import com.alsein.crmProject.DataAccess.IJobDal;
import com.alsein.crmProject.Entities.Job;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alims
 */
@Service
public class JobManager implements IJobService {

    public static IJobDal jobDal;

    @Autowired
    public JobManager(IJobDal jobDal) {
        JobManager.jobDal = jobDal;
    }

    @Override
    @Transactional
    public List<Job> getAll() {
        return JobManager.jobDal.getAll();
    }

    @Override
    @Transactional
    public Job getById(int id) {
        return JobManager.jobDal.getById(id);
    }

    @Override
    public void add(Job job) {
        this.jobDal.add(job);
    }

    @Override
    public void update(Job job) {
        JobManager.jobDal.update(job);
    }

    @Override
    public void delete(Job job) {
        JobManager.jobDal.delete(job);
    }
    
}
