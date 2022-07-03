/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alsein.crmProject.DataAccess;

import com.alsein.crmProject.Entities.Job;
import java.util.List;

/**
 *
 * @author alims
 */
public interface IJobDal {
    List<Job> getAll();
    Job getById(int id);
    void add(Job job);
    void update(Job job);
    void delete(Job job); 
}
