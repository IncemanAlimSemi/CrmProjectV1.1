/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author alims
 */
@Entity
@Table(name = "jobs")
public class Job extends Base {
    
    public Job() {
    }
    
    public Job(int id, String companyName, Date date, Date endDate, String person, String comment, Boolean isDone) {
        super(id, companyName, date, endDate, person, comment, isDone);
    }
    
}
