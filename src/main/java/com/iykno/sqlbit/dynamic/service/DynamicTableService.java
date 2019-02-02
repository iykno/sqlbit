package com.iykno.sqlbit.dynamic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.iykno.sqlbit.dynamic.common.SQLBuilder;
import com.iykno.sqlbit.dynamic.mapper.DynamicTableMapper;
import com.iykno.sqlbit.dynamic.model.ColumnConfig;
import com.iykno.sqlbit.dynamic.model.Config;

@Service
public class DynamicTableService {

	@Autowired
	ConfigService configService;

	@Autowired
	ColumnConfigService columnConfigService;

	@Autowired
	DynamicTableMapper dynamicTableMapper;

	public JSONObject createTable(int configId) {
		Config config = configService.getConfigById(configId);
		String createTableSQL = SQLBuilder.createTable(config);
		JSONObject result = new JSONObject();
		dynamicTableMapper.createTable(createTableSQL);

		result.put("createTableSQL", createTableSQL);
		return result;
	}

	public JSONObject delColumn(int columnConfigId) {
		JSONObject result = new JSONObject();
		ColumnConfig columnConfig = columnConfigService.getColumnConfigById(columnConfigId);
		if (columnConfig != null) {
			Config config = configService.getConfigById(columnConfig.getConfigId());
			String delColumnSQL = SQLBuilder.delColumn(config, columnConfig);
			dynamicTableMapper.delColumn(delColumnSQL);
			result.put("delColumnSQL", delColumnSQL);
		} else {
			result.put("error", "config not found.");
		}

		return result;
	}
	
	public JSONObject addColumn(int columnConfigId) {
		JSONObject result = new JSONObject();
		ColumnConfig columnConfig = columnConfigService.getColumnConfigById(columnConfigId);
		if (columnConfig != null) {
			Config config = configService.getConfigById(columnConfig.getConfigId());
			String addColumnSQL = SQLBuilder.addColumn(config, columnConfig);
			dynamicTableMapper.addColumn(addColumnSQL);
			result.put("addColumnSQL", addColumnSQL);
		} else {
			result.put("error", "config not found.");
		}

		return result;
	}

	

}
