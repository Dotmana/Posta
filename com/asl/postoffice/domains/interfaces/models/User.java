/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asl.postoffice.domains.interfaces.models;

/**
 *
 * @author HP
 */
public interface User {

    int getID();

    void setID(int ID);

    String getPassword();

    void setPassword(String pwd);

    String getUserName();

    void setEmailId(String email);

    String getEmailId();

    void setPhoneNumber(String phone);

    String getPhoneNumber();

    void setUserName(String name);

}
