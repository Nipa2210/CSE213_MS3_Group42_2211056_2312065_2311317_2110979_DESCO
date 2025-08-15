package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class ApprovalOfSalarySheet {
    private String EmployeeName;
    private String Month;
    private String Department;
    private int NetSalary;

    public static ArrayList<ApprovalOfSalarySheet> ApprovalSalarySheetList = new ArrayList<>();
    public ApprovalOfSalarySheet(String EmployeeName , String Month, String Department , int NetSalary ) {
        this.EmployeeName = EmployeeName;
        this.Month = Month;
        this.Department = Department;
        this.NetSalary = NetSalary;
    }

    public ApprovalOfSalarySheet() {
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getNetSalary() {
        return NetSalary;
    }

    public void setNetSalary(int netSalary) {
        NetSalary = netSalary;
    }

    @Override
    public String toString() {
        return "ApprovalOfSalarySheet{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", Month='" + Month + '\'' +
                ", Department='" + Department + '\'' +
                ", NetSalary=" + NetSalary +
                '}';
    }
}
