package com.example.notificationserviceapplication.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

public class EmailNotifications implements Serializable {

    private String toEmail;
    private String emailText;
    private String userIdentityGuid;



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
    @JsonProperty("message")
    public void customSetter(Map<String,String> message){
        this.toEmail = message.get("toEmail");
        this.emailText = message.get("emailText");
        this.userIdentityGuid = message.get("userIdentityGuid");
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
