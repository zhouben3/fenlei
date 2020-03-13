package com.fc.fenlei.entity;

public class DBBaseEntity {
    private Integer cId;

    private String cRegistrationTime;

    private Integer cRegisteredCapital;

    private String cIndustry;

    private String cRegion;

    private String cType;

    private String cControllerType;

    private Double cControllerShareholdingRatio;

    private String cFlag;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcRegistrationTime() {
        return cRegistrationTime;
    }

    public void setcRegistrationTime(String cRegistrationTime) {
        this.cRegistrationTime = cRegistrationTime == null ? null : cRegistrationTime.trim();
    }

    public Integer getcRegisteredCapital() {
        return cRegisteredCapital;
    }

    public void setcRegisteredCapital(Integer cRegisteredCapital) {
        this.cRegisteredCapital = cRegisteredCapital;
    }

    public String getcIndustry() {
        return cIndustry;
    }

    public void setcIndustry(String cIndustry) {
        this.cIndustry = cIndustry == null ? null : cIndustry.trim();
    }

    public String getcRegion() {
        return cRegion;
    }

    public void setcRegion(String cRegion) {
        this.cRegion = cRegion == null ? null : cRegion.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcControllerType() {
        return cControllerType;
    }

    public void setcControllerType(String cControllerType) {
        this.cControllerType = cControllerType == null ? null : cControllerType.trim();
    }

    public Double getcControllerShareholdingRatio() {
        return cControllerShareholdingRatio;
    }

    public void setcControllerShareholdingRatio(Double cControllerShareholdingRatio) {
        this.cControllerShareholdingRatio = cControllerShareholdingRatio;
    }

    public String getcFlag() {
        return cFlag;
    }

    public void setcFlag(String cFlag) {
        this.cFlag = cFlag == null ? null : cFlag.trim();
    }
}