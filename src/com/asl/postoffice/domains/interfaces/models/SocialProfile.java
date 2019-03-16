/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asl.postoffice.domains.interfaces.models;

import java.util.UUID;

/**
 *
 * @author HP
 */
public interface SocialProfile {

    UUID getID();

    void setID(UUID id);

    UUID getUserID();

    void setUserID(UUID id);
    
    String getProfileId();
    void setProfileId();
    String getProfilePic();
    void setProfilePic();
    String getAccessToken();
    void setAccessToken();
    SocialProfileType getProfileType();
    void setProfileType(SocialProfileType profileType);
    SocialProfileStatus getProfileStatus();
    void setProfileStatus(SocialProfileStatus profileStatus);
    
    

}
