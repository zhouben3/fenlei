package com.fc.fenlei.mapper;

import com.fc.fenlei.entity.DBBaseEntity;

public interface DBBaseEntityMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(DBBaseEntity record);

    int insertSelective(DBBaseEntity record);

    DBBaseEntity selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(DBBaseEntity record);

    int updateByPrimaryKey(DBBaseEntity record);
}