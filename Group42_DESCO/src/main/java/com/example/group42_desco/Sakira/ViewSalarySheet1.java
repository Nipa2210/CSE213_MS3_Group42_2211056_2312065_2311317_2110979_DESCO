package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class ViewSalarySheet1 {
    private String EmployeeID;
    private String Month;
    private String Department;
    private int NetSalary;

    public static ArrayList<ViewSalarySheet1> SalarySheetList = new ArrayList<>();

    public ViewSalarySheet1(String EmployeeID , String Month, String Department , int NetSalary ) {
        this.EmployeeID = EmployeeID;
        this.Month = Month;
        this.Department = Department;
        this.NetSalary = NetSalary;
    }

    public ViewSalarySheet1() {
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeName(String employeeID) {
        EmployeeID = employeeID;
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

    public Integer getNetSalary() {
        return NetSalary;
    }

    public void setNetSalary(Integer netSalary) {
        NetSalary = netSalary;
    }

    public static ArrayList<ViewSalarySheet1> getSalarySheetList() {
        return SalarySheetList;
    }

    public static void setSalarySheetList(ArrayList<ViewSalarySheet1> salarySheetList) {
        SalarySheetList = salarySheetList;
    }

    @Override
    public String toString() {
        return "ViewSalarySheet1{" +
                "EmployeeName='" + EmployeeID + '\'' +
                ", Month='" + Month + '\'' +
                ", Department='" + Department + '\'' +
                ", NetSalary='" + NetSalary + '\'' +
                '}';
    }
}

