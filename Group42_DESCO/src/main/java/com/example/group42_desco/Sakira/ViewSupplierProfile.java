package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class ViewSupplierProfile {
    private String SupplierID;
    private String TransectionID;
    private int ContactInfo;
    private String PaymentStatus;

    public static ArrayList<ViewSupplierProfile> SupplierProfileList = new ArrayList<>();

    public ViewSupplierProfile(String SupplierID , String TransectionID, int ContactInfo , String PaymentStatus ) {
        this.SupplierID = SupplierID;
        this.TransectionID = TransectionID;
        this.ContactInfo = ContactInfo;
        this.PaymentStatus = PaymentStatus;
    }

    public ViewSupplierProfile() {
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String supplierID) {
        SupplierID = supplierID;
    }

    public String getTransectionID() {
        return TransectionID;
    }

    public void setTransectionID(String transectionID) {
        TransectionID = transectionID;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public int getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(int contactInfo) {
        ContactInfo = contactInfo;
    }

    public static ArrayList<ViewSupplierProfile> getSupplierProfileList() {
        return SupplierProfileList;
    }

    public static void setSupplierProfileList(ArrayList<ViewSupplierProfile> supplierProfileList) {
        SupplierProfileList = supplierProfileList;
    }

    @Override
    public String toString() {
        return "ViewSupplierProfile{" +
                "SupplierID='" + SupplierID + '\'' +
                ", TransectionID='" + TransectionID + '\'' +
                ", ContactInfo=" + ContactInfo +
                ", PaymentStatus='" + PaymentStatus + '\'' +
                '}';
    }
}
