/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asl.postoffice.domains.models;

/**
 *
 * @author Dotun.Adekunle
 */
public class FacebookGroup
    {
        public String ProfileGroupId;
        public String AccessToken;
        public String Name;
        public String Email;

    public String getProfileGroupId() {
        return ProfileGroupId;
    }

    public void setProfileGroupId(String ProfileGroupId) {
        this.ProfileGroupId = ProfileGroupId;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
        
        
    }