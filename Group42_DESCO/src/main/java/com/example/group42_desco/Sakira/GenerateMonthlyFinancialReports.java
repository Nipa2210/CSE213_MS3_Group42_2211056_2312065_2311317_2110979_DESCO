package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class GenerateMonthlyFinancialReports {
    private String IncomeStatement;
    private int BalanceSheet;
    private String Month;


    public static ArrayList<GenerateMonthlyFinancialReports> FinancialReportsList = new ArrayList<>();

    public GenerateMonthlyFinancialReports(String IncomeStatement, int BalanceSheet, String Month) {
        this.IncomeStatement = IncomeStatement;
        this.BalanceSheet = BalanceSheet;
        this.Month = Month;

    }

    public GenerateMonthlyFinancialReports() {
    }

    public String getIncomeStatement() {
        return IncomeStatement;
    }

    public void setIncomeStatement(String incomeStatement) {
        IncomeStatement = incomeStatement;
    }

    public int getBalanceSheet() {
        return BalanceSheet;
    }

    public void setBalanceSheet(int balanceSheet) {
        BalanceSheet = balanceSheet;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public static ArrayList<GenerateMonthlyFinancialReports> getFinancialReportsList() {
        return FinancialReportsList;
    }

    public static void setFinancialReportsList(ArrayList<GenerateMonthlyFinancialReports> financialReportsList) {
        FinancialReportsList = financialReportsList;
    }

    @Override
    public String toString() {
        return "GenerateMonthlyFinancialReports{" +
                "IncomeStatement='" + IncomeStatement + '\'' +
                ", BalanceSheet=" + BalanceSheet +
                ", Month='" + Month + '\'' +
                '}';
    }
}
