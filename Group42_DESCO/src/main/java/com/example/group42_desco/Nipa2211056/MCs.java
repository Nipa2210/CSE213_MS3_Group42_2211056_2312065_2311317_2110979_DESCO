package com.example.group42_desco.Nipa2211056;

public class MCs {
    private String customerID, problemType,problemStatus;

    public MCs(String customerID, String problemType, String problemStatus) {
        this.customerID = customerID;
        this.problemType = problemType;
        this.problemStatus = problemStatus;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getProblemStatus() {
        return problemStatus;
    }

    public void setProblemStatus(String problemStatus) {
        this.problemStatus = problemStatus;
    }

    @Override
    public String toString() {
        return "MCs{" +
                "customerID='" + customerID + '\'' +
                ", problemType='" + problemType + '\'' +
                ", problemStatus='" + problemStatus + '\'' +
                '}';
    }
}
