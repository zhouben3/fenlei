package com.fc.fenlei.mapper;

import com.fc.fenlei.entity.DBYearReportEntity;
import com.fc.fenlei.entity.DBYearReportEntityKey;

public interface DBYearReportEntityMapper {
    int deleteByPrimaryKey(DBYearReportEntityKey key);

    int insert(DBYearReportEntity record);

    int insertSelective(DBYearReportEntity record);

    DBYearReportEntity selectByPrimaryKey(DBYearReportEntityKey key);

    int updateByPrimaryKeySelective(DBYearReportEntity record);

    int updateByPrimaryKey(DBYearReportEntity record);
}