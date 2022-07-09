/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.alsein.crmProject.Business;

import com.alsein.crmProject.Entities.User;
import java.util.List;

/**
 *
 * @author alims
 */
public interface IUserService {
    User get(String userName, String password);
}
