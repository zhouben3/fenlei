package com.fc.fenlei.util;

import com.csvreader.CsvReader;
import com.fc.fenlei.entity.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

/**
 * @author zb
 * @date 2020/3/10 13:05
 **/
public class CsvUtil {


    public static DBBaseEntity getBase1(CsvReader csvReader) throws IOException, ParseException {
        DBBaseEntity dbBaseEntity = new DBBaseEntity();
        dbBaseEntity.setcId(Integer.parseInt(csvReader.get(0)));
//       Date date = new Date(csvReader.get(1));
        dbBaseEntity.setcRegistrationTime(
                (csvReader.get(1).equals("NA") || csvReader.get(1) == null) ? null : csvReader.get(1));
        //0 1 2对应csv文件的列数
        dbBaseEntity.setcControllerShareholdingRatio(
                (csvReader.get(8).equals("NA") || csvReader.get(8) == null) ? null : Double.parseDouble(csvReader.get(8)));
        dbBaseEntity.setcControllerType((csvReader.get(6).equals("NA") || csvReader.get(6) == null) ? null : csvReader.get(6));
        dbBaseEntity.setcFlag((csvReader.get(9).equals("NA") || csvReader.get(9) == null) ? null : csvReader.get(9));
        dbBaseEntity.setcIndustry((csvReader.get(3).equals("NA") || csvReader.get(3) == null) ? null : csvReader.get(3));
        dbBaseEntity.setcRegion((csvReader.get(4).equals("NA") || csvReader.get(4) == null) ? null : csvReader.get(4));
        dbBaseEntity.setcRegisteredCapital((csvReader.get(2).equals("NA") || csvReader.get(2) == null) ? null : Integer.parseInt(csvReader.get(2)));
        dbBaseEntity.setcType((csvReader.get(5).equals("NA") || csvReader.get(5) == null) ? null : csvReader.get(5));
//        System.out.println(dbBaseEntity.getcId());
        return dbBaseEntity;
    }

    public static DBBaseEntity getBase2(CsvReader csvReader) throws IOException, ParseException {
        DBBaseEntity dbBaseEntity = new DBBaseEntity();
        dbBaseEntity.setcId(Integer.parseInt(csvReader.get(0)));
//       Date date = new Date(csvReader.get(1));
        dbBaseEntity.setcRegistrationTime(
                (csvReader.get(1).equals("NA") || csvReader.get(1) == null) ? null : csvReader.get(1));
        //0 1 2对应csv文件的列数
        dbBaseEntity.setcControllerShareholdingRatio(
                (csvReader.get(7).equals("NA") || csvReader.get(7) == null) ? null : Double.parseDouble(csvReader.get(7)));
        dbBaseEntity.setcControllerType((csvReader.get(6).equals("NA") || csvReader.get(6) == null) ? null : csvReader.get(6));
        dbBaseEntity.setcFlag((csvReader.get(8).equals("NA") || csvReader.get(8) == null) ? null : csvReader.get(8));
        dbBaseEntity.setcIndustry((csvReader.get(3).equals("NA") || csvReader.get(3) == null) ? null : csvReader.get(3));
        dbBaseEntity.setcRegion((csvReader.get(4).equals("NA") || csvReader.get(4) == null) ? null : csvReader.get(4));
        dbBaseEntity.setcRegisteredCapital((csvReader.get(2).equals("NA") || csvReader.get(2) == null) ? null : Integer.parseInt(csvReader.get(2)));
        dbBaseEntity.setcType((csvReader.get(5).equals("NA") || csvReader.get(5) == null) ? null : csvReader.get(5));
//        System.out.println(dbBaseEntity.getcId());
        return dbBaseEntity;
    }

    public static DBKnowledgeEntity getKnow(CsvReader csvReader) throws IOException, ParseException {
        DBKnowledgeEntity dbKnowledgeEntity = new DBKnowledgeEntity();
        dbKnowledgeEntity.setcId(Integer.parseInt(csvReader.get(0)));
        dbKnowledgeEntity.setcPatent((csvReader.get(1).equals("NA") || csvReader.get(1) == null) ? null : csvReader.get(1));
        dbKnowledgeEntity.setcTrademark((csvReader.get(2).equals("NA") || csvReader.get(2) == null) ? null : csvReader.get(2));
        dbKnowledgeEntity.setcCopyright((csvReader.get(3).equals("NA") || csvReader.get(3) == null) ? null : csvReader.get(3));

        return dbKnowledgeEntity;
    }

    public static DBMoneyEntity getMoney(CsvReader csvReader) throws IOException, ParseException {
        DBMoneyEntity dbMoneyEntity = new DBMoneyEntity();
        dbMoneyEntity.setcId(Integer.parseInt(csvReader.get(0)));
        dbMoneyEntity.setcYear(csvReader.get(1));
        dbMoneyEntity.setcDebtFinancingLine((csvReader.get(2).equals("NA") || csvReader.get(2) == null) ? null : Integer.parseInt(csvReader.get(2)));
        dbMoneyEntity.setcDebtFinancingCost((csvReader.get(3).equals("NA") || csvReader.get(3) == null) ? null : Double.parseDouble(csvReader.get(3)));
        dbMoneyEntity.setcEquityFinancingLine((csvReader.get(4).equals("NA") || csvReader.get(4) == null) ? null : Double.parseDouble(csvReader.get(4)));
        dbMoneyEntity.setcEquityFinancingCost((csvReader.get(5).equals("NA") || csvReader.get(5) == null) ? null : Double.parseDouble(csvReader.get(5)));
        dbMoneyEntity.setcInternalTradeLine((csvReader.get(6).equals("NA") || csvReader.get(6) == null) ? null : Double.parseDouble(csvReader.get(6)));
        dbMoneyEntity.setcInternalTradeCost((csvReader.get(7).equals("NA") || csvReader.get(7) == null) ? null : Double.parseDouble(csvReader.get(7)));
        dbMoneyEntity.setcProjectPolicyLine((csvReader.get(8).equals("NA") || csvReader.get(8) == null) ? null : Double.parseDouble(csvReader.get(8)));
        dbMoneyEntity.setcProjectPolicyCost((csvReader.get(9).equals("NA") || csvReader.get(9) == null) ? null : Double.parseDouble(csvReader.get(9)));
        return dbMoneyEntity;
    }

    public static DBYearReportEntity getYear(CsvReader csvReader) throws IOException, ParseException {
        DBYearReportEntity dbYearReportEntity = new DBYearReportEntity();
        dbYearReportEntity.setcId(Integer.parseInt(csvReader.get(0)));
        dbYearReportEntity.setcYear((csvReader.get(1).equals("NA") || csvReader.get(1) == null) ? null : csvReader.get(1));
        dbYearReportEntity.setcEmnum((csvReader.get(2).equals("NA") || csvReader.get(2) == null) ? null : Integer.parseInt(csvReader.get(2)));
        dbYearReportEntity.setcTotalAssets((csvReader.get(3).equals("NA") || csvReader.get(3) == null) ? null : Integer.parseInt(csvReader.get(3)));
        dbYearReportEntity.setcTotalLiabilities((csvReader.get(4).equals("NA") || csvReader.get(4) == null) ? null : Integer.parseInt(csvReader.get(4)));
        dbYearReportEntity.setcTotalIncome((csvReader.get(5).equals("NA") || csvReader.get(5) == null) ? null : Integer.parseInt(csvReader.get(5)));
        dbYearReportEntity.setcMainIncome((csvReader.get(6).equals("NA") || csvReader.get(6) == null) ? null : Double.parseDouble(csvReader.get(6)));
        dbYearReportEntity.setcTotalProfit((csvReader.get(7).equals("NA") || csvReader.get(7) == null) ? null : Double.parseDouble(csvReader.get(7)));
        dbYearReportEntity.setcNetProfit((csvReader.get(8).equals("NA") || csvReader.get(8) == null) ? null : Double.parseDouble(csvReader.get(8)));
        dbYearReportEntity.setcTotalTax((csvReader.get(9).equals("NA") || csvReader.get(9) == null) ? null : Double.parseDouble(csvReader.get(9)));
        dbYearReportEntity.setcTotalEquity((csvReader.get(10).equals("NA") || csvReader.get(10) == null) ? null : Integer.parseInt(csvReader.get(10)));
        return dbYearReportEntity;
    }

    public static DBExtractEntity getExtract(CsvReader csvReader) throws IOException, ParseException {
        DBExtractEntity dbExtractEntity = new DBExtractEntity();
        dbExtractEntity.setcId(Integer.parseInt(csvReader.get(1)));
        dbExtractEntity.setcAge((csvReader.get(2).equals("NA") || csvReader.get(2) == null) ? null : Integer.parseInt(turn(csvReader.get(2))));
        dbExtractEntity.setcIndustry((csvReader.get(3).equals("NA") || csvReader.get(3) == null) ? null : csvReader.get(3));
        dbExtractEntity.setcRegion((csvReader.get(4).equals("NA") || csvReader.get(4) == null) ? null : csvReader.get(4));
        dbExtractEntity.setcControllerType((csvReader.get(5).equals("NA") || csvReader.get(5) == null) ? null : csvReader.get(5));
        dbExtractEntity.setcControllerShareholdingRatio((csvReader.get(6).equals("NA") || csvReader.get(6) == null) ? null : csvReader.get(6));
        dbExtractEntity.setcRegisteredCapital((csvReader.get(7).equals("NA") || csvReader.get(7) == null) ? null : Integer.parseInt(turn(csvReader.get(7))));
        dbExtractEntity.setcEnterpriseType((csvReader.get(8).equals("NA") || csvReader.get(8) == null) ? null : csvReader.get(8));
        dbExtractEntity.setcCreativity((csvReader.get(9).equals("NA") || csvReader.get(9) == null) ? null : Integer.parseInt(turn(csvReader.get(9))));
        dbExtractEntity.setcEquityRatio((csvReader.get(10).equals("NA") || csvReader.get(10) == null) ? null : Double.parseDouble(csvReader.get(10)));
        dbExtractEntity.setcNetProfitRate((csvReader.get(11).equals("NA") || csvReader.get(11) == null) ? null : Double.parseDouble(csvReader.get(11)));
        dbExtractEntity.setcRoe((csvReader.get(12).equals("NA") || csvReader.get(12) == null) ? null : Double.parseDouble(csvReader.get(12)));
        dbExtractEntity.setcTotalGrowthRate((csvReader.get(13).equals("NA") || csvReader.get(13) == null) ? null : Double.parseDouble(csvReader.get(13)));
        dbExtractEntity.setcTotalReturn((csvReader.get(14).equals("NA") || csvReader.get(14) == null) ? null : Double.parseDouble(csvReader.get(14)));
        dbExtractEntity.setcNoperatingProportion((csvReader.get(15).equals("NA") || csvReader.get(15) == null) ? null : Double.parseDouble(csvReader.get(15)));
        dbExtractEntity.setcOperatinAverageGrowthRate((csvReader.get(16).equals("NA") || csvReader.get(16) == null) ? null : Double.parseDouble(csvReader.get(16)));
        dbExtractEntity.setcOperatingGrowthRate((csvReader.get(17).equals("NA") || csvReader.get(17) == null) ? null : Double.parseDouble(csvReader.get(17)));
        dbExtractEntity.setcAssetsAndLiabilities((csvReader.get(18).equals("NA") || csvReader.get(18) == null) ? null : Double.parseDouble(csvReader.get(18)));
        dbExtractEntity.setcCapitalAverageGrowthRate(getTurn(csvReader.get(19)));
        return dbExtractEntity;
    }

    public static Double getTurn(String s) {
        try {
            Double d = Double.parseDouble(s);
            return d;
        } catch (Exception e) {
            return null;
        }

    }

    public static String turn(String str) {
        String ss[] = str.split("\\.");
        String s = ss[0];
        return s;
    }

    public static void main(String args[]) {
        String str = "inf";
        System.out.println(getTurn(str));
    }
}
