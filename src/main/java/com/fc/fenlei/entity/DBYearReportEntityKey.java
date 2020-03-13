package com.fc.fenlei.entity;

public class DBYearReportEntityKey {
    private Integer cId;

    private String cYear;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcYear() {
        return cYear;
    }

    public void setcYear(String cYear) {
        this.cYear = cYear == null ? null : cYear.trim();
    }
}