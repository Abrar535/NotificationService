package com.example.notificationserviceapplication.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SmsNotifications implements Serializable {

    private String destinationPhoneNumber;
    private String smsText;
    private String userIdentityGuid;

    public SmsNotifications(@JsonProperty("destinationPhoneNumber") String destinationPhoneNumber,
                            @JsonProperty("smsText") String smsText,
                            @JsonProperty("userIdentityGuid") String userIdentityGuid){

        this.destinationPhoneNumber = destinationPhoneNumber;
        this.smsText = smsText;
        this.userIdentityGuid = userIdentityGuid;

    }

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
}

