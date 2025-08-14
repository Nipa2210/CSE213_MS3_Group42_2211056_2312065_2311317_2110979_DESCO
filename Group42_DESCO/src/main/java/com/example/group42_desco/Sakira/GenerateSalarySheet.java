package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class GenerateSalarySheet {
    private String EmployeeID;
    private String Month;
    private String Department;
    private int NetSalary;


    public static ArrayList<GenerateSalarySheet> SalarySheetList = new ArrayList<>();

    public GenerateSalarySheet(String EmployeeID, String Month, String Department, int NetSalary) {
        this.EmployeeID = EmployeeID;
        this.Month = Month;
        this.Department = Department;
        this.NetSalary = NetSalary;
    }

    public GenerateSalarySheet() {
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
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

    public int getNetSalary() {
        return NetSalary;
    }

    public void setNetSalary(int netSalary) {
        NetSalary = netSalary;
    }

    public static ArrayList<GenerateSalarySheet> getSalarySheetList() {
        return SalarySheetList;
    }

    public static void setSalarySheetList(ArrayList<GenerateSalarySheet> salarySheetList) {
        SalarySheetList = salarySheetList;
    }

    @Override
    public String toString() {
        return "GenerateSalarySheet{" +
                "EmployeeID='" + EmployeeID + '\'' +
                ", Month='" + Month + '\'' +
                ", Department='" + Department + '\'' +
                ", NetSalary=" + NetSalary +
                '}';
    }
}
