/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author alims
 */

@Entity
@Table(name = "offers")
public class Offer extends Base {
    
    @Column(name = "ACCEPTDATE")
    private Date acceptDate; 
    
    @Column(name = "ISACCEPT")
    private Boolean isAccept;
    
    @Column(name = "ISINVOICE")
    private Boolean isInvoice;

    public Offer() {
    }

    public Offer(int id, String companyName, Date date, Date endDate, Date acceptDate, String person, String comment, Boolean isDone, Boolean isAccept, Boolean isInvoice) {
        super(id, companyName, date, endDate, person, comment, isDone);
        this.acceptDate = acceptDate;
        this.isAccept = isAccept;
        this.isInvoice = isInvoice;
    }

    /**
     * @return the acceptDate
     */
    public Date getAcceptDate() {
        return acceptDate;
    }

    /**
     * @param acceptDate the acceptDate to set
     */
    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * @return the isAccept
     */
    public Boolean getIsAccept() {
        return isAccept;
    }

    /**
     * @param isAccept the isAccept to set
     */
    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }

    /**
     * @return the isInvoice
     */
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    /**
     * @param isInvoice the isInvoice to set
     */
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }
    
    
    
}
