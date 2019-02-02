package com.iykno.sqlbit.dynamic.common;

import java.util.List;
import java.util.stream.Collectors;

import com.iykno.sqlbit.dynamic.model.ColumnConfig;
import com.iykno.sqlbit.dynamic.model.ColumnType;
import com.iykno.sqlbit.dynamic.model.Config;

public class SQLBuilder {

	/**
	 * 
	 * @param config
	 * @return
	 */
	public static String createTable(Config config) {
		StringBuilder sb = new StringBuilder();
		sb.append(" CREATE TABLE IF NOT EXISTS ");
		sb.append(config.getTableName());
		sb.append(" (");
		List<String> columnSqlList = config.getColmnConfigList().stream().map(t -> t.toString())
				.filter(t -> t != null && t.length() > 0).collect(Collectors.toList());
		sb.append(String.join(",", columnSqlList));

		sb.append(" ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='" + config.getTableNameCN() + "' ");
		return sb.toString();
	}

	/**
	 * 加字段 包括索引
	 * 
	 * @param config
	 * @param columnConfig
	 * @return
	 */
	public static String addColumn(Config config, ColumnConfig columnConfig) {
		StringBuilder sb = new StringBuilder();
		sb.append(" ALTER TABLE ");
		sb.append(config.getTableName());
		sb.append(" ADD COLUMN ").append(columnConfig.getColumnName()).append(" varchar(")
				.append(columnConfig.getColumnLength()).append(") NULL   COMMENT '")
				.append(columnConfig.getColumnNameCN()).append("'");
		if (ColumnType.Index.getValue() == columnConfig.getColumnType()) {
			// ADD INDEX INDEX_AAA (AAA)
			sb.append(" ,ADD  INDEX INDEX_").append(columnConfig.getColumnName()).append(" (")
					.append(columnConfig.getColumnName()).append(")");
		}
		return sb.toString();
	}

	/**
	 * 删除字段
	 * 
	 * @param config
	 * @param columnConfig
	 * @return
	 */
	public static String delColumn(Config config, ColumnConfig columnConfig) {
		StringBuilder sb = new StringBuilder();
		sb.append(" ALTER TABLE ");
		sb.append(config.getTableName());
		sb.append(" DROP COLUMN ").append(columnConfig.getColumnName());
		return sb.toString();
	}

}
