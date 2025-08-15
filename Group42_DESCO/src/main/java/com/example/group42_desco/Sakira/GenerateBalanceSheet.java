package com.example.group42_desco.Sakira;

import java.util.ArrayList;

public class GenerateBalanceSheet {
    private String DesiredMonth;
    private int FiscalYear;
    private int TotalAssets;
    private int TotalLiabilities;
    private int EquityBreakdown;

    public static ArrayList<GenerateBalanceSheet> BalanceSheetList = new ArrayList<>();

    public GenerateBalanceSheet(String DesiredMonth, int FiscalYear, int TotalAssets, int TotalLiabilities, int EquityBreakdown) {
        this.DesiredMonth = DesiredMonth;
        this.FiscalYear = FiscalYear;
        this.TotalAssets = TotalAssets;
        this.TotalLiabilities = TotalLiabilities;
        this.EquityBreakdown = EquityBreakdown;
    }

    public GenerateBalanceSheet() {
    }

    public String getDesiredMonth() {
        return DesiredMonth;
    }

    public void setDesiredMonth(String desiredMonth) {
        DesiredMonth = desiredMonth;
    }

    public int getFiscalYear() {
        return FiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        FiscalYear = fiscalYear;
    }

    public int getTotalAssets() {
        return TotalAssets;
    }

    public void setTotalAssets(int totalAssets) {
        TotalAssets = totalAssets;
    }

    public int getTotalLiabilities() {
        return TotalLiabilities;
    }

    public void setTotalLiabilities(int totalLiabilities) {
        TotalLiabilities = totalLiabilities;
    }

    public int getEquityBreakdown() {
        return EquityBreakdown;
    }

    public void setEquityBreakdown(int equityBreakdown) {
        EquityBreakdown = equityBreakdown;
    }

    public static ArrayList<GenerateBalanceSheet> getBalanceSheetList() {
        return BalanceSheetList;
    }

    public static void setBalanceSheetList(ArrayList<GenerateBalanceSheet> balanceSheetList) {
        BalanceSheetList = balanceSheetList;
    }

    @Override
    public String toString() {
        return "GenerateBalanceSheet{" +
                "DesiredMonth='" + DesiredMonth + '\'' +
                ", FiscalYear=" + FiscalYear +
                ", TotalAssets=" + TotalAssets +
                ", TotalLiabilities=" + TotalLiabilities +
                ", EquityBreakdown=" + EquityBreakdown +
                '}';
    }
}
