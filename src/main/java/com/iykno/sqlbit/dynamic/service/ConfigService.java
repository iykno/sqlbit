package com.iykno.sqlbit.dynamic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iykno.sqlbit.dynamic.mapper.ConfigMapper;
import com.iykno.sqlbit.dynamic.model.ColumnConfig;
import com.iykno.sqlbit.dynamic.model.Config;
import com.iykno.sqlbit.dynamic.model.ConfigExample;
import com.iykno.sqlbit.dynamic.model.ConfigExample.Criteria;

@Service
public class ConfigService {

	@Autowired
	private ConfigMapper configMapper;

	@Autowired
	private ColumnConfigService columnConfigService;

	public List<Config> getConfigList() {
		ConfigExample example = new ConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andMarkEqualTo(0);
		List<Config> list = configMapper.selectByExample(example);
		return list;
	}

	public Config getConfigById(int configId) {
		Config config = configMapper.selectByPrimaryKey(configId);
		if (config != null) {
			config.setColmnConfigList(columnConfigService.getColumnListById(configId));
		}
		return config;
	}

	public Config getConfigByTableName(String tableName) {
		ConfigExample example = new ConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andTableNameEqualTo(tableName);
		criteria.andMarkEqualTo(0);
		List<Config> list = configMapper.selectByExample(example);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}

	public List<String> getColumnListByTableName(String tableName) {
		List<String> columnList = new ArrayList<String>();
		Config config = getConfigByTableName(tableName);
		if (config != null) {
			List<ColumnConfig> columnConfigList = columnConfigService
					.getColumnListById(config.getConfigId());
			if (columnConfigList != null) {
				columnConfigList.forEach(t -> columnList.add(t.getColumnName()));
			}
		}
		return columnList;
	}

	public String getColumnsStrByTableName(String tableName) {
		return String.join(",", getColumnListByTableName(tableName));
	}

}
