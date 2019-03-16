/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asl.postoffice.domains.models;

/**
 *
 * @author Dotun Adekunle
 */
public class User implements com.asl.postoffice.domains.interfaces.models.User {

    private int id;
    private String password;
    private String username;
    private String email;
    private String phoneNumber;

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int ID) {
        this.id = ID;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String pwd) {
       this.password= pwd;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public void setEmailId(String email) {
        this.email = email;
    }

    @Override
    public String getEmailId() {
        return this.email;
    }

    @Override
    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setUserName(String name) {
        this.username = name;
    }

}
