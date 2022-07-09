/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alsein.crmProject.Business;

import com.alsein.crmProject.Entities.Offer;
import java.util.List;

/**
 *
 * @author alims
 */
public interface IOfferService {
    List<Offer> getAll();
    Offer getById(int id);
    void add(Offer offer);
    void update(Offer offer);
    void delete(Offer offer); 
}
