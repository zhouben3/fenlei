package com.fc.fenlei.mapper;

import com.fc.fenlei.entity.DBMoneyEntity;
import com.fc.fenlei.entity.DBMoneyEntityKey;

public interface DBMoneyEntityMapper {
    int deleteByPrimaryKey(DBMoneyEntityKey key);

    int insert(DBMoneyEntity record);

    int insertSelective(DBMoneyEntity record);

    DBMoneyEntity selectByPrimaryKey(DBMoneyEntityKey key);

    int updateByPrimaryKeySelective(DBMoneyEntity record);

    int updateByPrimaryKey(DBMoneyEntity record);
}