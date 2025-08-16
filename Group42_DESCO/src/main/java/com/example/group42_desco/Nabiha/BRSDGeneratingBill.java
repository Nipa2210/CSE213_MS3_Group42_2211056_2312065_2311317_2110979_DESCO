package com.example.group42_desco.Nabiha;

public class BRSDGeneratingBill {
    private String customerName;
    private int customerId, transactionNo, totalBill;


    public BRSDGeneratingBill(int customerId, String customerName, int totalBill, int transactionNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.totalBill = totalBill;
        this.transactionNo = transactionNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(int transactionNo) {
        this.transactionNo = transactionNo;
    }

    @Override
    public String toString() {
        return "BRSDGeneratingBill{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", transactionNo=" + transactionNo +
                ", totalBill=" + totalBill +
                '}';
    }
}
