package com.cartisan.entity;

import java.util.List;

public class VehicleRepairData {
    private String name;
    private String phoneNo;
    private String emailId;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnquiryId() {
        return enquiryId;
    }

    public void setEnquiryId(String enquiryId) {
        this.enquiryId = enquiryId;
    }

    public List<String> getVehiclePictures() {
        return vehiclePictures;
    }

    public void setVehiclePictures(List<String> vehiclePictures) {
        this.vehiclePictures = vehiclePictures;
    }

    private String enquiryId;
    private List<String> vehiclePictures;


}
