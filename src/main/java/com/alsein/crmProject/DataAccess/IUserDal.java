/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alsein.crmProject.DataAccess;

import com.alsein.crmProject.Entities.User;

/**
 *
 * @author alims
 */
public interface IUserDal {
    User getById(int id);
}
