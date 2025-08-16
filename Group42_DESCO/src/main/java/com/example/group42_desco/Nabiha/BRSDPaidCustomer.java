package com.example.group42_desco.Nabiha;

public class BRSDPaidCustomer {
    private String customerName,customerID, transactionNo;
    private int totalBill;


    public BRSDPaidCustomer(String customerID, String customerName, int totalBill, String transactionNo) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.totalBill = totalBill;
        this.transactionNo = transactionNo;
    }

    public BRSDPaidCustomer(String text, String text1, String text2, int totalbill) {
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
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

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    @Override
    public String toString() {
        return "BRSDPaidCustomer{" +
                "customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", transactionNo='" + transactionNo + '\'' +
                ", totalBill=" + totalBill +
                '}';
    }
}
