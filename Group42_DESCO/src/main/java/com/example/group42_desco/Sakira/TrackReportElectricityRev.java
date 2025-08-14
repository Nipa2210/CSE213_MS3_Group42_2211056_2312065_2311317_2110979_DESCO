package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class TrackReportElectricityRev {
    private String BillingPeriod;
    private String Zone;
    private String PaymentMethod;
    private int TotalCollectedRevenue;

    public static ArrayList<TrackReportElectricityRev> RevenueList = new ArrayList<>();

    public TrackReportElectricityRev(String BillingPeriod, String Zone, String PaymentMethod, int TotalCollectedRevenue) {
        this.BillingPeriod = BillingPeriod;
        this.Zone = Zone;
        this.PaymentMethod = PaymentMethod;
        this.TotalCollectedRevenue = TotalCollectedRevenue;
    }

    public TrackReportElectricityRev() {
    }

    public String getBillingPeriod() {
        return BillingPeriod;
    }

    public void setBillingPeriod(String billingPeriod) {
        BillingPeriod = billingPeriod;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    public int getTotalCollectedRevenue() {
        return TotalCollectedRevenue;
    }

    public void setTotalCollectedRevenue(int totalCollectedRevenue) {
        TotalCollectedRevenue = totalCollectedRevenue;
    }

    public static ArrayList<TrackReportElectricityRev> getRevenueList() {
        return RevenueList;
    }

    public static void setRevenueList(ArrayList<TrackReportElectricityRev> revenueList) {
        RevenueList = revenueList;
    }

    @Override
    public String toString() {
        return "TrackReportElectricityRev{" +
                "BillingPeriod='" + BillingPeriod + '\'' +
                ", Zone='" + Zone + '\'' +
                ", PaymentMethod='" + PaymentMethod + '\'' +
                ", TotalCollectedRevenue=" + TotalCollectedRevenue +
                '}';
    }
}
