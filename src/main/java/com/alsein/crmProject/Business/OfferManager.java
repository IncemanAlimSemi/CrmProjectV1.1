/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Business;

import com.alsein.crmProject.DataAccess.IOfferDal;
import com.alsein.crmProject.Entities.Offer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alims
 */
@Service
public class OfferManager implements IOfferService{

    public static IOfferDal offerDal;

    @Autowired
    public OfferManager(IOfferDal offerDal) {
        OfferManager.offerDal = offerDal;
    }
    
    
    
    @Override
    @Transactional
    public List<Offer> getAll() {
        return OfferManager.offerDal.getAll();
    }

    @Override
    @Transactional
    public Offer getById(int id) {
        return OfferManager.offerDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Offer offer) {
        OfferManager.offerDal.add(offer);
    }

    @Override
    @Transactional
    public void update(Offer offer) {
        OfferManager.offerDal.update(offer);
    }

    @Override
    @Transactional
    public void delete(Offer offer) {
        OfferManager.offerDal.delete(offer);
    }

}
