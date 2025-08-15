package com.example.group42_desco.Nabiha;

import java.time.LocalDate;

public class HRMAddingEmployee {
    private String employeeName,Designation;
    private int employeeId;
    private LocalDate DOB,joiningDate;


    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }


    public HRMAddingEmployee(String designation, LocalDate DOB, int employeeId, String employeeName, LocalDate joiningDate) {
        Designation = designation;
        this.DOB = DOB;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.joiningDate = joiningDate;
    }


    @Override
    public String toString() {
        return "HRMAddingEmployee{" +
                "Designation='" + Designation + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", DOB=" + DOB +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
