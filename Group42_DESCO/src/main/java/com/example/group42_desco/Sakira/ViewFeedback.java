package com.example.group42_desco.Sakira;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViewFeedback {
    private String CustomerName;
    private int CustomerContact;
    private String CustomerMessage;
    private LocalDate Date;

    public static ArrayList<ViewFeedback> FeedbackList = new ArrayList<>();

    public ViewFeedback(String CustomerName , int CustomerContact , String CustomerMessage , LocalDate ContactDetails ) {
        this.CustomerName = CustomerName;
        this.CustomerContact = CustomerContact;
        this.CustomerMessage = CustomerMessage;
        this.Date = Date;
    }

    public ViewFeedback() {
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getCustomerContact() {
        return CustomerContact;
    }

    public void setCustomerContact(int customerContact) {
        CustomerContact = customerContact;
    }

    public String getCustomerMessage() {
        return CustomerMessage;
    }

    public void setCustomerMessage(String customerMessage) {
        CustomerMessage = customerMessage;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public static ArrayList<ViewFeedback> getFeedbackList() {
        return FeedbackList;
    }

    public static void setFeedbackList(ArrayList<ViewFeedback> feedbackList) {
        FeedbackList = feedbackList;
    }

    @Override
    public String toString() {
        return "ViewFeedback{" +
                "CustomerName='" + CustomerName + '\'' +
                ", CustomerContact=" + CustomerContact +
                ", CustomerMessage='" + CustomerMessage + '\'' +
                ", Date=" + Date +
                '}';
    }
}
