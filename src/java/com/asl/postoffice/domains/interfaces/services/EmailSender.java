/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asl.postoffice.domains.interfaces.services;

/**
 *
 * @author HP
 */
public interface EmailSender {
    
    String SendMail(String from, String passsword, String to, String bcc, String cc, String subject, String body, String UserName , String Password);
    
}
