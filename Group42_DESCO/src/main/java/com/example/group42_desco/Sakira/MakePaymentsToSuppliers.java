package com.example.group42_desco.Sakira;

import java.time.LocalDate;
import java.util.ArrayList;

public class MakePaymentsToSuppliers {
    private int Amount;
    private LocalDate Date;
    private int ReferenceNumber;
    private String PaymentMethod;
    private String SupplierID;

    public static ArrayList<MakePaymentsToSuppliers> SupplierPaymentList = new ArrayList<>();

    public MakePaymentsToSuppliers(int Amount, LocalDate Date, int ReferenceNumber, String PaymentMethod, String SupplierID) {
        this.Amount = Amount;
        this.Date = Date;
        this.ReferenceNumber = ReferenceNumber;
        this.PaymentMethod = PaymentMethod;
        this.SupplierID = SupplierID;
    }

    public MakePaymentsToSuppliers() {
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public int getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String supplierID) {
        SupplierID = supplierID;
    }

    public static ArrayList<MakePaymentsToSuppliers> getSupplierPaymentList() {
        return SupplierPaymentList;
    }

    public static void setSupplierPaymentList(ArrayList<MakePaymentsToSuppliers> supplierPaymentList) {
        SupplierPaymentList = supplierPaymentList;
    }

    @Override
    public String toString() {
        return "MakePaymentsToSuppliers{" +
                "Amount=" + Amount +
                ", Date=" + Date +
                ", ReferenceNumber=" + ReferenceNumber +
                ", PaymentMethod='" + PaymentMethod + '\'' +
                ", SupplierID='" + SupplierID + '\'' +
                '}';
    }
}
