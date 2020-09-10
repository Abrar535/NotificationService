package com.example.notificationserviceapplication.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Map;

public class SmsNotifications implements Serializable {

    private String destinationPhoneNumber;
    private String smsText;
    private String userIdentityGuid;


    public String getDestinationPhoneNumber() {
        return destinationPhoneNumber;
    }

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getUserIdentityGuid() {
        return userIdentityGuid;
    }

    public void setUserIdentityGuid(String userIdentityGuid) {
        this.userIdentityGuid = userIdentityGuid;
    }

    @JsonProperty("message")
    public void customSetter(Map<String,String> message){
        this.destinationPhoneNumber = message.get("destinationPhoneNumber");
        this.smsText = message.get("smsText");
        this.userIdentityGuid = message.get("userIdentityGuid");
    }
}

