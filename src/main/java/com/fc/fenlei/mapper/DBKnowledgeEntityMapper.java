package com.fc.fenlei.mapper;

import com.fc.fenlei.entity.DBKnowledgeEntity;

public interface DBKnowledgeEntityMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(DBKnowledgeEntity record);

    int insertSelective(DBKnowledgeEntity record);

    DBKnowledgeEntity selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(DBKnowledgeEntity record);

    int updateByPrimaryKey(DBKnowledgeEntity record);
}