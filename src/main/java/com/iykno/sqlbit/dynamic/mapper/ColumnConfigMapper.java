package com.iykno.sqlbit.dynamic.mapper;

import com.iykno.sqlbit.dynamic.model.ColumnConfig;
import com.iykno.sqlbit.dynamic.model.ColumnConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnConfigMapper {
    long countByExample(ColumnConfigExample example);

    int deleteByExample(ColumnConfigExample example);

    int deleteByPrimaryKey(Integer columnConfigId);

    int insert(ColumnConfig record);

    int insertSelective(ColumnConfig record);

    List<ColumnConfig> selectByExample(ColumnConfigExample example);

    ColumnConfig selectByPrimaryKey(Integer columnConfigId);

    int updateByExampleSelective(@Param("record") ColumnConfig record, @Param("example") ColumnConfigExample example);

    int updateByExample(@Param("record") ColumnConfig record, @Param("example") ColumnConfigExample example);

    int updateByPrimaryKeySelective(ColumnConfig record);

    int updateByPrimaryKey(ColumnConfig record);
}