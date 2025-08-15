package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class ViewCustomerProfile {
    private String CustomerName;
    private String CustomerID;
    private String CustomerArea;
    private int ContactDetails;
    private String BloodGroup;

    public static ArrayList<ViewCustomerProfile> CustomerProfileList = new ArrayList<>();

    public ViewCustomerProfile(String CustomerName , String CustomerID , String CustomerArea , int ContactDetails ,  String BloodGroup  ) {
        this.CustomerName = CustomerName;
        this.CustomerID = CustomerID;
        this.CustomerArea = CustomerArea;
        this.ContactDetails = ContactDetails;
        this.BloodGroup = BloodGroup;
    }

    public ViewCustomerProfile() {
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustomerArea() {
        return CustomerArea;
    }

    public void setCustomerArea(String customerArea) {
        CustomerArea = customerArea;
    }

    public int getContactDetails() {
        return ContactDetails;
    }

    public void setContactDetails(int contactDetails) {
        ContactDetails = contactDetails;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public static ArrayList<ViewCustomerProfile> getCustomerProfileList() {
        return CustomerProfileList;
    }

    public static void setCustomerProfileList(ArrayList<ViewCustomerProfile> customerProfileList) {
        CustomerProfileList = customerProfileList;
    }

    @Override
    public String toString() {
        return "ViewCustomerProfile{" +
                "CustomerName='" + CustomerName + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", CustomerArea='" + CustomerArea + '\'' +
                ", ContactDetails=" + ContactDetails +
                ", BloodGroup='" + BloodGroup + '\'' +
                '}';
    }
}
