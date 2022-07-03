/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author alims
 */
@MappedSuperclass
public class Base {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Column(name = "COMPANYNAME")
    String companyName;
    
    @Column(name = "DATE")
    Date date;
    
    @Column(name = "ENDDATE")
    Date endDate;
    
    @Column(name = "PERSON")
    String person;
    
    @Column(name = "COMMENT")
    String comment;
    
    @Column(name = "ISDONE")
    Boolean isDone;

    public Base() {
    }

    public Base(int id, String companyName, Date date, Date endDate, String person, String comment, Boolean isDone) {
        this.id = id;
        this.companyName = companyName;
        this.date = date;
        this.endDate = endDate;
        this.person = person;
        this.comment = comment;
        this.isDone = isDone;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the person
     */
    public String getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(String person) {
        this.person = person;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the isDone
     */
    public Boolean getIsDone() {
        return isDone;
    }

    /**
     * @param isDone the isDone to set
     */
    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
    
    
}
