package com.iykno.sqlbit.dynamic.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface DynamicTableMapper {
    
    @Update("${sql}")
    public Integer createTable(@Param("sql") String sql);
    
    @Update("${sql}")
    public Integer addColumn(@Param("sql") String sql);

    @Update("${sql}")
	public void delColumn(@Param("sql") String sql);
    
}
