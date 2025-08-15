package com.example.group42_desco.Nipa2211056;

public class EUsage {
    private String Billingmonth;
    private Double Cost;
    private int Unitsconsumed;

    public EUsage(String billingmonth, Double cost, int unitsconsumed) {
        this.Billingmonth = billingmonth;
        this.Cost = cost;
        this.Unitsconsumed = unitsconsumed;
    }

    public String getBillingmonth() {
        return Billingmonth;
    }

    public void setBillingmonth(String billingmonth) {
        this.Billingmonth = billingmonth;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        this.Cost = cost;
    }

    public int getUnitsconsumed() {
        return Unitsconsumed;
    }

    public void setUnitsconsumed(int unitsconsumed) {
        this.Unitsconsumed = unitsconsumed;
    }

    @Override
    public String toString() {
        return "EUsage{" +
                "Billingmonth='" + Billingmonth + '\'' +
                ", Cost=" + Cost +
                ", Unitsconsumed=" + Unitsconsumed +
                '}';
    }
}
