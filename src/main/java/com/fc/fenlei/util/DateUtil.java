package com.fc.fenlei.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author zb
 * @date 2020/3/10 21:35
 **/
public class DateUtil {
    public static Date getDate(String Time) throws ParseException {
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy MM hh");
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date date = format.parse(Time);
        return date;
    }

    public static void main(String[] args) throws ParseException {
        String temp = "2010";
        System.out.println(getDate(temp));
    }
}
