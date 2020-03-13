package com.fc.fenlei;

import com.fc.fenlei.mapper.*;
import com.fc.fenlei.util.CsvUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.csvreader.CsvReader;

import java.io.*;
import java.nio.charset.Charset;
import java.sql.Date;
import java.text.ParseException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FenleiApplicationTests {
    @Autowired
    DBBaseEntityMapper dbBaseEntityMapper;
    @Autowired
    DBKnowledgeEntityMapper dbKnowledgeEntityMapper;
    @Autowired
    DBMoneyEntityMapper dbMoneyEntityMapper;
    @Autowired
    DBYearReportEntityMapper dbYearReportEntityMapper;
    @Autowired
    DBExtractEntityMapper dbExtractEntityMapper;

    @Test
    public void base_verify1() throws IOException, ParseException {
        File file = new File("C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_verify1.csv");
//        String myCharset = System.getProperty("file.encoding");
//        System.out.println(myCharset);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
//        String filename = "C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv";
        CsvReader csvReader = new CsvReader(isr);
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            dbBaseEntityMapper.insert(CsvUtil.getBase1(csvReader));
//            System.out.println(csvReader.get(3));
        }
    }

    @Test
    public void base_train_sum() throws IOException, ParseException {
        File file = new File("C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv");
//        String myCharset = System.getProperty("file.encoding");
//        System.out.println(myCharset);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
//        String filename = "C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv";
        CsvReader csvReader = new CsvReader(isr);
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            dbBaseEntityMapper.insert(CsvUtil.getBase2(csvReader));
//            System.out.println(csvReader.get(3));
        }
    }

    @Test
    public void knowledge_train_sum() throws IOException, ParseException {
        File file = new File("C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\paient_information_verify1.csv");
//        String myCharset = System.getProperty("file.encoding");
//        System.out.println(myCharset);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
//        String filename = "C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv";
        CsvReader csvReader = new CsvReader(isr);
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            dbKnowledgeEntityMapper.insert(CsvUtil.getKnow(csvReader));
//            System.out.println(csvReader.get(3));
        }
    }

    @Test
    public void money_report_train_sum() throws IOException, ParseException {
        File file = new File("C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\money_report_train_sum.csv");
//        String myCharset = System.getProperty("file.encoding");
//        System.out.println(myCharset);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
//        String filename = "C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv";
        CsvReader csvReader = new CsvReader(isr);
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            dbMoneyEntityMapper.insert(CsvUtil.getMoney(csvReader));
//            System.out.println(csvReader.get(3));
        }
    }

    @Test
    public void year_report_train_sum() throws IOException, ParseException {
        File file = new File("C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\year_report_train_sum.csv");
//        String myCharset = System.getProperty("file.encoding");
//        System.out.println(myCharset);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
//        String filename = "C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv";
        CsvReader csvReader = new CsvReader(isr);
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            dbYearReportEntityMapper.insert(CsvUtil.getYear(csvReader));
//            System.out.println(csvReader.get(3));
        }
    }

    @Test
    public void extract() throws IOException, ParseException {
        File file = new File("C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\孙完成\\result_验证集.csv");
//        String myCharset = System.getProperty("file.encoding");
//        System.out.println(myCharset);
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
//        String filename = "C:\\Users\\zhouben\\Desktop\\服创2\\数据表\\base_train_sum.csv";
        CsvReader csvReader = new CsvReader(isr);
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            dbExtractEntityMapper.insert(CsvUtil.getExtract(csvReader));
//            System.out.println(csvReader.get(3));
        }
    }
}
