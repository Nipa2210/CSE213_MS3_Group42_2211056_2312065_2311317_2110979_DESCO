package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class CreateEBill {
    private String CustomerID;
    private String CustomerName;
    private int MeterNumber;
    private int TotalAmount;

    public static ArrayList<CreateEBill> EBillList = new ArrayList<>();

    public CreateEBill(String CustomerID, String CustomerName, int MeterNumber, int TotalAmount) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.MeterNumber = MeterNumber;
        this.TotalAmount = TotalAmount;
    }

    public CreateEBill() {
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getMeterNumber() {
        return MeterNumber;
    }

    public void setMeterNumber(int meterNumber) {
        MeterNumber = meterNumber;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public static ArrayList<CreateEBill> getEBillList() {
        return EBillList;
    }

    public static void setEBillList(ArrayList<CreateEBill> EBillList) {
        CreateEBill.EBillList = EBillList;
    }

    @Override
    public String toString() {
        return "CreateEBill{" +
                "CustomerID='" + CustomerID + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", MeterNumber=" + MeterNumber +
                ", TotalAmount=" + TotalAmount +
                '}';
    }
}


