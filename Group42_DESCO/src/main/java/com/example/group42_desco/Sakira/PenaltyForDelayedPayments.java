package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class PenaltyForDelayedPayments {
    private int PreviousBill;
    private int AddedCharge;
    private int UpdatedTotalElectricityBill;

    public static ArrayList<PenaltyForDelayedPayments> PaymentsList = new ArrayList<>();

    public PenaltyForDelayedPayments(int PreviousBill , int AddedCharge , int UpdatedTotalElectricityBill ) {
        this.PreviousBill = PreviousBill;
        this.AddedCharge = AddedCharge;
        this.UpdatedTotalElectricityBill = UpdatedTotalElectricityBill;
    }

    public PenaltyForDelayedPayments() {
    }

    public int getPreviousBill() {
        return PreviousBill;
    }

    public void setPreviousBill(int previousBill) {
        PreviousBill = previousBill;
    }

    public int getAddedCharge() {
        return AddedCharge;
    }

    public void setAddedCharge(int addedCharge) {
        AddedCharge = addedCharge;
    }

    public int getUpdatedTotalElectricityBill() {
        return UpdatedTotalElectricityBill;
    }

    public void setUpdatedTotalElectricityBill(int updatedTotalElectricityBill) {
        UpdatedTotalElectricityBill = updatedTotalElectricityBill;
    }

    public static ArrayList<PenaltyForDelayedPayments> getPaymentsList() {
        return PaymentsList;
    }

    public static void setPaymentsList(ArrayList<PenaltyForDelayedPayments> paymentsList) {
        PaymentsList = paymentsList;
    }

    @Override
    public String toString() {
        return "PenaltyForDelayedPayments{" +
                "PreviousBill=" + PreviousBill +
                ", AddedCharge=" + AddedCharge +
                ", UpdatedTotalElectricityBill=" + UpdatedTotalElectricityBill +
                '}';
    }
}
