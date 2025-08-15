package com.example.group42_desco.Nabiha;

import java.time.LocalDate;

public class HRManagerJobPosting {
 private String designation, eduQualification, JobDescription;
 private LocalDate applicationStartingdate, applicationEndingdate;

    public LocalDate getApplicationEndingdate() {
        return applicationEndingdate;
    }

    public void setApplicationEndingdate(LocalDate applicationEndingdate) {
        this.applicationEndingdate = applicationEndingdate;
    }

    public LocalDate getApplicationStartingdate() {
        return applicationStartingdate;
    }

    public void setApplicationStartingdate(LocalDate applicationStartingdate) {
        this.applicationStartingdate = applicationStartingdate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEduQualification() {
        return eduQualification;
    }

    public void setEduQualification(String eduQualification) {
        this.eduQualification = eduQualification;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }


    public HRManagerJobPosting(LocalDate applicationEndingdate, LocalDate applicationStartingdate, String designation, String eduQualification, String jobDescription) {
        this.applicationEndingdate = applicationEndingdate;
        this.applicationStartingdate = applicationStartingdate;
        this.designation = designation;
        this.eduQualification = eduQualification;
        JobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "HRManagerJobPosting{" +
                "applicationEndingdate=" + applicationEndingdate +
                ", designation='" + designation + '\'' +
                ", eduQualification='" + eduQualification + '\'' +
                ", JobDescription='" + JobDescription + '\'' +
                ", applicationStartingdate=" + applicationStartingdate +
                '}';
    }
}
