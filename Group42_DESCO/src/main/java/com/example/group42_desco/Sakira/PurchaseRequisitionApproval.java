package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class PurchaseRequisitionApproval {
    private int Quantity;
    private String SupplierID;
    private int UnitPrice;
    private int TotalCost;
    private int BudgetCode;

    public static ArrayList<PurchaseRequisitionApproval> ApprovalList = new ArrayList<>();

    public PurchaseRequisitionApproval(int Quantity , String SupplierID , int UnitPrice , int TotalCost , int BudgetCode ) {
        this.Quantity = Quantity;
        this.SupplierID = SupplierID;
        this.UnitPrice = UnitPrice;
        this.TotalCost = TotalCost;
        this.BudgetCode = BudgetCode;
    }

    public PurchaseRequisitionApproval() {
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String supplierID) {
        SupplierID = supplierID;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(int totalCost) {
        TotalCost = totalCost;
    }

    public int getBudgetCode() {
        return BudgetCode;
    }

    public void setBudgetCode(int budgetCode) {
        BudgetCode = budgetCode;
    }

    public static ArrayList<PurchaseRequisitionApproval> getApprovalList() {
        return ApprovalList;
    }

    public static void setApprovalList(ArrayList<PurchaseRequisitionApproval> approvalList) {
        ApprovalList = approvalList;
    }

    @Override
    public String toString() {
        return "PurchaseRequisitionApproval{" +
                "Quantity=" + Quantity +
                ", SupplierID='" + SupplierID + '\'' +
                ", UnitPrice=" + UnitPrice +
                ", TotalCost=" + TotalCost +
                ", BudgetCode=" + BudgetCode +
                '}';
    }
}
