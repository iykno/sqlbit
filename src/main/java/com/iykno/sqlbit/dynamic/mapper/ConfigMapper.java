package com.iykno.sqlbit.dynamic.mapper;

import com.iykno.sqlbit.dynamic.model.Config;
import com.iykno.sqlbit.dynamic.model.ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMapper {
    long countByExample(ConfigExample example);

    int deleteByExample(ConfigExample example);

    int deleteByPrimaryKey(Integer configId);

    int insert(Config record);

    int insertSelective(Config record);

    List<Config> selectByExample(ConfigExample example);

    Config selectByPrimaryKey(Integer configId);

    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}