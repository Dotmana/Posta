/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asl.postoffice.domains.models;

import com.asl.postoffice.domains.enums.FbPageSubscription;
import com.asl.postoffice.domains.enums.FbProfileType;
import java.util.Date;

/**
 *
 * @author Dotun.Adekunle
 */
public class FacebookAccounts {

    private boolean isAccessTokenActive;
    private Long id;
    private String fbUserId;
    private String fbUserName;
    private String accessToken;
    private Long friends;
    private String emailId;
    private String coverPic;
    private String birthday;
    private String education;
    private String college;
    private String workposition;
    private String homeTown;
    private String gender;
    private String Bio;
    private String About;
    private String WorkCompany;
    private FbProfileType FbProfileType;
    private FbPageSubscription FbPageSubscription;
    private String ProfileUrl;
    private boolean IsActive;
    private long UserId;
    private Date LastUpdate;
    private Date SchedulerUpdate;
    private Date PageShareathonUpdate;
    private Date GroupShareathonUpdate;
    private Date LastPageReportGenerated;
    private boolean Is90DayDataUpdated;
    private Date ContentShareathonUpdate;
    private boolean SocailSignInEnable;
    
    public FacebookAccounts() {
        isAccessTokenActive = true;
    }

    public boolean isIsAccessTokenActive() {
        return isAccessTokenActive;
    }

    public void setIsAccessTokenActive(boolean isAccessTokenActive) {
        this.isAccessTokenActive = isAccessTokenActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFbUserId() {
        return fbUserId;
    }

    public void setFbUserId(String fbUserId) {
        this.fbUserId = fbUserId;
    }

    public String getFbUserName() {
        return fbUserName;
    }

    public void setFbUserName(String fbUserName) {
        this.fbUserName = fbUserName;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getFriends() {
        return friends;
    }

    public void setFriends(Long friends) {
        this.friends = friends;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getWorkposition() {
        return workposition;
    }

    public void setWorkposition(String workposition) {
        this.workposition = workposition;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }

    public String getWorkCompany() {
        return WorkCompany;
    }

    public void setWorkCompany(String WorkCompany) {
        this.WorkCompany = WorkCompany;
    }

    public FbProfileType getFbProfileType() {
        return FbProfileType;
    }

    public void setFbProfileType(FbProfileType FbProfileType) {
        this.FbProfileType = FbProfileType;
    }

    public FbPageSubscription getFbPageSubscription() {
        return FbPageSubscription;
    }

    public void setFbPageSubscription(FbPageSubscription FbPageSubscription) {
        this.FbPageSubscription = FbPageSubscription;
    }

    public String getProfileUrl() {
        return ProfileUrl;
    }

    public void setProfileUrl(String ProfileUrl) {
        this.ProfileUrl = ProfileUrl;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long UserId) {
        this.UserId = UserId;
    }

    public Date getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(Date LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    public Date getSchedulerUpdate() {
        return SchedulerUpdate;
    }

    public void setSchedulerUpdate(Date SchedulerUpdate) {
        this.SchedulerUpdate = SchedulerUpdate;
    }

    public Date getPageShareathonUpdate() {
        return PageShareathonUpdate;
    }

    public void setPageShareathonUpdate(Date PageShareathonUpdate) {
        this.PageShareathonUpdate = PageShareathonUpdate;
    }

    public Date getGroupShareathonUpdate() {
        return GroupShareathonUpdate;
    }

    public void setGroupShareathonUpdate(Date GroupShareathonUpdate) {
        this.GroupShareathonUpdate = GroupShareathonUpdate;
    }

    public Date getLastPageReportGenerated() {
        return LastPageReportGenerated;
    }

    public void setLastPageReportGenerated(Date LastPageReportGenerated) {
        this.LastPageReportGenerated = LastPageReportGenerated;
    }

    public boolean isIs90DayDataUpdated() {
        return Is90DayDataUpdated;
    }

    public void setIs90DayDataUpdated(boolean Is90DayDataUpdated) {
        this.Is90DayDataUpdated = Is90DayDataUpdated;
    }

    public Date getContentShareathonUpdate() {
        return ContentShareathonUpdate;
    }

    public void setContentShareathonUpdate(Date ContentShareathonUpdate) {
        this.ContentShareathonUpdate = ContentShareathonUpdate;
    }

    public boolean isSocailSignInEnable() {
        return SocailSignInEnable;
    }

    public void setSocailSignInEnable(boolean SocailSignInEnable) {
        this.SocailSignInEnable = SocailSignInEnable;
    }
    
    

}
