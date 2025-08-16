package com.example.group42_desco.Nabiha;

public class BRSDAllCustomer {
    private String customerName,CustomerType,customerID;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }


    public BRSDAllCustomer(String customerID, String customerName, String customerType) {
        this.customerID = customerID;
        this.customerName = customerName;
        CustomerType = customerType;

    }


    @Override
    public String toString() {
        return "BRSDAllCustomer{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                '}';
    }
}
