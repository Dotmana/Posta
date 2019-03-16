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
 public class FacebookPage
    {
        private String ProfilePageId;
        private String AccessToken;
        private String Name;
        private String Email;
        private String LikeCount;
        private int connected;
        private int friendsCount;

    public String getProfilePageId() {
        return ProfilePageId;
    }

    public void setProfilePageId(String ProfilePageId) {
        this.ProfilePageId = ProfilePageId;
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

    public String getLikeCount() {
        return LikeCount;
    }

    public void setLikeCount(String LikeCount) {
        this.LikeCount = LikeCount;
    }

    public int getConnected() {
        return connected;
    }

    public void setConnected(int connected) {
        this.connected = connected;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    }

    