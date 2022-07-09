/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Business;

import com.alsein.crmProject.DataAccess.IUserDal;
import com.alsein.crmProject.Entities.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alims
 */
@Service
public class UserManager implements IUserService {

    public static IUserDal userDal;

    @Autowired
    public UserManager(IUserDal userDal) {
        this.userDal = userDal; 
    }
    
    @Override
    @Transactional
    public User get(String userName, String password) {        
        User user = null;
        List<User> users = userDal.getAll();
        for(User u: users){
            if(u.getUserName().equals(userName) & u.getPassword().equals(password)){
                user = u;
            } 
        }
        return user;
    }
}

