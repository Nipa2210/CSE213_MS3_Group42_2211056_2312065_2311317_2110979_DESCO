package com.example.group42_desco.Nipa2211056;

public class Feedback {
    private String subject,feedbackMsg,rating;

    public Feedback(String subject, String feedbackMsg, String rating) {
        this.subject = subject;
        this.feedbackMsg = feedbackMsg;
        this.rating = rating;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFeedbackMsg() {
        return feedbackMsg;
    }

    public void setFeedbackMsg(String feedbackMsg) {
        this.feedbackMsg = feedbackMsg;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "subject='" + subject + '\'' +
                ", feedbackMsg='" + feedbackMsg + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
