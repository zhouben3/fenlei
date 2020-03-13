package com.fc.fenlei.entity;

public class DBYearReportEntity extends DBYearReportEntityKey {
    private Integer cEmnum;

    private Integer cTotalAssets;

    private Integer cTotalLiabilities;

    private Integer cTotalIncome;

    private Double cMainIncome;

    private Double cTotalProfit;

    private Double cNetProfit;

    private Double cTotalTax;

    private Integer cTotalEquity;

    public Integer getcEmnum() {
        return cEmnum;
    }

    public void setcEmnum(Integer cEmnum) {
        this.cEmnum = cEmnum;
    }

    public Integer getcTotalAssets() {
        return cTotalAssets;
    }

    public void setcTotalAssets(Integer cTotalAssets) {
        this.cTotalAssets = cTotalAssets;
    }

    public Integer getcTotalLiabilities() {
        return cTotalLiabilities;
    }

    public void setcTotalLiabilities(Integer cTotalLiabilities) {
        this.cTotalLiabilities = cTotalLiabilities;
    }

    public Integer getcTotalIncome() {
        return cTotalIncome;
    }

    public void setcTotalIncome(Integer cTotalIncome) {
        this.cTotalIncome = cTotalIncome;
    }

    public Double getcMainIncome() {
        return cMainIncome;
    }

    public void setcMainIncome(Double cMainIncome) {
        this.cMainIncome = cMainIncome;
    }

    public Double getcTotalProfit() {
        return cTotalProfit;
    }

    public void setcTotalProfit(Double cTotalProfit) {
        this.cTotalProfit = cTotalProfit;
    }

    public Double getcNetProfit() {
        return cNetProfit;
    }

    public void setcNetProfit(Double cNetProfit) {
        this.cNetProfit = cNetProfit;
    }

    public Double getcTotalTax() {
        return cTotalTax;
    }

    public void setcTotalTax(Double cTotalTax) {
        this.cTotalTax = cTotalTax;
    }

    public Integer getcTotalEquity() {
        return cTotalEquity;
    }

    public void setcTotalEquity(Integer cTotalEquity) {
        this.cTotalEquity = cTotalEquity;
    }
}