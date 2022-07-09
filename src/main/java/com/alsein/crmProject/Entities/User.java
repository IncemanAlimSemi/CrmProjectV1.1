/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alims
 */

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "USERNAME")
    private String userName;
    
    @Column(name = "PASSWORD")
    private String password;
    
    @Column(name = "NAMEOFUSERS")
    private String nameOfUser;

    public User(int id, String userName, String password, String nameOfUser) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.nameOfUser = nameOfUser;
    }

    public User() {
    }
    
    private int getId() { 
        return id;
    }
   
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }  
}
