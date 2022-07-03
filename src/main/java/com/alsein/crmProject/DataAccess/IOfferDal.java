/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alsein.crmProject.DataAccess;

import com.alsein.crmProject.Entities.Offer;
import java.util.List;

/**
 *
 * @author alims
 */
public interface IOfferDal {
    List<Offer> getAll();
    Offer getById(int id);
    void add(Offer offer);
    void update(Offer offer);
    void delete(Offer offer); 
}
