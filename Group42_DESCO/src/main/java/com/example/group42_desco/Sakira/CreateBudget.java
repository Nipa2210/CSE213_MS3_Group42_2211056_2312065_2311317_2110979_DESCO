package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class CreateBudget {
    private int FiscalYear;
    private String Department;
    private int TotalBudget;

    public static ArrayList<CreateBudget>BudgetList = new ArrayList<>();

    public CreateBudget(int FiscalYear , String Department , int TotalBudget ) {
        this.FiscalYear = FiscalYear;
        this.Department = Department;
        this.TotalBudget = TotalBudget;
    }

    public CreateBudget() {
    }

    public int getFiscalYear() {
        return FiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        FiscalYear = fiscalYear;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getTotalBudget() {
        return TotalBudget;
    }

    public void setTotalBudget(int totalBudget) {
        TotalBudget = totalBudget;
    }

    public static ArrayList<CreateBudget> getBudgetList() {
        return BudgetList;
    }

    public static void setBudgetList(ArrayList<CreateBudget> budgetList) {
        BudgetList = budgetList;
    }

    @Override
    public String toString() {
        return "CreateBudget{" +
                "FiscalYear=" + FiscalYear +
                ", Department='" + Department + '\'' +
                ", TotalBudget=" + TotalBudget +
                '}';
    }
}
