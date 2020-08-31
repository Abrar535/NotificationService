package com.example.notificationserviceapplication.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EmailNotifications implements Serializable {

    private String toEmail;
    private String emailText;
    private String userIdentityGuid;

    public EmailNotifications(@JsonProperty("toEmail") String toEmail,
                              @JsonProperty("emailText") String emailText,
                              @JsonProperty("userIdentityGuid") String userIdentityGuid){

        this.toEmail = toEmail;
        this.emailText = emailText;
        this.userIdentityGuid = userIdentityGuid;

    }


    public String getToEmail() {
        return toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getUserIdentityGuid() {
        return userIdentityGuid;
    }

    public void setUserIdentityGuid(String userIdentityGuid) {
        this.userIdentityGuid = userIdentityGuid;
    }

    @Override
    public String toString() {
        return "EmailNotifications{" +
                "toEmail='" + toEmail + '\'' +
                ", emailText='" + emailText + '\'' +
                ", userIdentityGuid='" + userIdentityGuid + '\'' +
                '}';
    }
}
