package com.example.group42_desco.Nipa2211056;

public class PayBill {
    private String customername, meternumber, billingmonth, duedate, status;
    private Double billamount;

    public PayBill(String customername, String meternumber, String billingmonth, String duedate, String status, Double billamount) {
        this.customername = customername;
        this.meternumber = meternumber;
        this.billingmonth = billingmonth;
        this.duedate = duedate;
        this.status = status;
        this.billamount = billamount;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getMeternumber() {
        return meternumber;
    }

    public void setMeternumber(String meternumber) {
        this.meternumber = meternumber;
    }

    public String getBillingmonth() {
        return billingmonth;
    }

    public void setBillingmonth(String billingmonth) {
        this.billingmonth = billingmonth;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getBillamount() {
        return billamount;
    }

    public void setBillamount(Double billamount) {
        this.billamount = billamount;
    }

    @Override
    public String toString() {
        return "PayBill{" +
                "customername='" + customername + '\'' +
                ", meternumber='" + meternumber + '\'' +
                ", billingmonth='" + billingmonth + '\'' +
                ", duedate='" + duedate + '\'' +
                ", status='" + status + '\'' +
                ", billamount=" + billamount +
                '}';
    }

    public String toString(String random) {return customername+","+meternumber+","+billingmonth+","+duedate+","+status+","+billingmonth+"\n";
    }
}
