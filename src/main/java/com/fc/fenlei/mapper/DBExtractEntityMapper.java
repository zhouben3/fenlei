package com.fc.fenlei.mapper;

import com.fc.fenlei.entity.DBExtractEntity;

public interface DBExtractEntityMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(DBExtractEntity record);

    int insertSelective(DBExtractEntity record);

    DBExtractEntity selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(DBExtractEntity record);

    int updateByPrimaryKey(DBExtractEntity record);
}