package com.iykno.sqlbit.dynamic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iykno.sqlbit.dynamic.mapper.ColumnConfigMapper;
import com.iykno.sqlbit.dynamic.model.ColumnConfig;
import com.iykno.sqlbit.dynamic.model.ColumnConfigExample;
import com.iykno.sqlbit.dynamic.model.ColumnConfigExample.Criteria;

@Service
public class ColumnConfigService {

	@Autowired
	private ColumnConfigMapper columnConfigMapper;

	public ColumnConfig getColumnConfigById(int columnConfigId) {
		return columnConfigMapper.selectByPrimaryKey(columnConfigId);
	}
	
	/**
	 * 根据主键查询
	 * @param configId
	 * @return
	 */
	public List<ColumnConfig> getColumnListById(int configId) {
		ColumnConfigExample example = new ColumnConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andConfigIdEqualTo(configId);
		criteria.andMarkEqualTo(0);
		return columnConfigMapper.selectByExample(example);
	}
	
	/**
	 * 根据字段名称查询
	 * @param columnName
	 * @return
	 */
	public ColumnConfig getColumnConfigByColumnName(int configId, String columnName) {
		return getColumnConfigByColumnName(configId, columnName, 0);
	}

	/**
	 * 更加字段名称查询
	 *
	 * @param configId
	 * @param columnName
	 * @param dictType
	 * @return
	 */
	public ColumnConfig getColumnConfigByColumnName(int configId,String columnName,int dictType) {
		ColumnConfigExample example = new ColumnConfigExample();
		Criteria criteria = example.createCriteria();
		if(configId > 0) {
			criteria.andConfigIdEqualTo(configId);
		}
		criteria.andMarkEqualTo(0);
		criteria.andColumnNameEqualTo(columnName);
		
		List<ColumnConfig> columnList = columnConfigMapper.selectByExample(example);
		if(columnList != null && !columnList.isEmpty()) {
			return columnList.get(0);
		}else {
			return null;
		}
		
	}
	

}
