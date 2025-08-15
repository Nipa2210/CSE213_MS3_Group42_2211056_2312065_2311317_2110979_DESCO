package com.example.group42_desco.Nipa2211056;

public class Complaint {
    private String complaintType;
    private String description;

    public Complaint(String complaintType, String description) {
        this.complaintType = complaintType;
        this.description = description;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintType='" + complaintType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
