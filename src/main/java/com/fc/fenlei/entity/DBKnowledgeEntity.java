package com.fc.fenlei.entity;

public class DBKnowledgeEntity {
    private Integer cId;

    private String cPatent;

    private String cTrademark;

    private String cCopyright;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcPatent() {
        return cPatent;
    }

    public void setcPatent(String cPatent) {
        this.cPatent = cPatent == null ? null : cPatent.trim();
    }

    public String getcTrademark() {
        return cTrademark;
    }

    public void setcTrademark(String cTrademark) {
        this.cTrademark = cTrademark == null ? null : cTrademark.trim();
    }

    public String getcCopyright() {
        return cCopyright;
    }

    public void setcCopyright(String cCopyright) {
        this.cCopyright = cCopyright == null ? null : cCopyright.trim();
    }
}