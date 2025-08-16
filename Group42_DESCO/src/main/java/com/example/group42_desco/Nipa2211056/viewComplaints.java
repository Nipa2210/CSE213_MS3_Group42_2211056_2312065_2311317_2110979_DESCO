package com.example.group42_desco.Nipa2211056;

public class viewComplaints {
    private String CID,Cnumer,Mnumer,Subdate,ComplaintStatus;

    public viewComplaints(String CID, String cnumer, String mnumer, String subdate, String complaintStatus) {
        this.CID = CID;
        this.Cnumer = cnumer;
        this.Mnumer = mnumer;
        this.Subdate = subdate;
        this.ComplaintStatus = complaintStatus;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getCnumer() {
        return Cnumer;
    }

    public void setCnumer(String cnumer) {
        this.Cnumer = cnumer;
    }

    public String getSubdate() {
        return Subdate;
    }

    public void setSubdate(String subdate) {
        this.Subdate = subdate;
    }

    public String getMnumer() {
        return Mnumer;
    }

    public void setMnumer(String mnumer) {
        this.Mnumer = mnumer;
    }

    public String getComplaintStatus() {
        return ComplaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.ComplaintStatus = complaintStatus;
    }

    @Override
    public String toString() {
        return "viewComplaints{" +
                "CID='" + CID + '\'' +
                ", Cnumer='" + Cnumer + '\'' +
                ", Mnumer='" + Mnumer + '\'' +
                ", Subdate='" + Subdate + '\'' +
                ", ComplaintStatus='" + ComplaintStatus + '\'' +
                '}';
    }
}
