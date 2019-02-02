package com.iykno.sqlbit.dynamic.model;

import java.util.Date;

public class ColumnConfig {
	private Integer columnConfigId;

	private Integer configId;

	private String columnName;

	private String columnNameCN;

	private Integer columnLength;

	private Integer columnType;

	private String createBy;

	private Date createTime;

	private String updateBy;

	private Date updateTime;

	private String description;

	private Integer mark;

	public Integer getColumnConfigId() {
		return columnConfigId;
	}

	public void setColumnConfigId(Integer columnConfigId) {
		this.columnConfigId = columnConfigId;
	}

	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName == null ? null : columnName.trim();
	}

	public String getColumnNameCN() {
		return columnNameCN;
	}

	public void setColumnNameCN(String columnNameCN) {
		this.columnNameCN = columnNameCN == null ? null : columnNameCN.trim();
	}

	public Integer getColumnLength() {
		return columnLength;
	}

	public void setColumnLength(Integer columnLength) {
		this.columnLength = columnLength;
	}

	public Integer getColumnType() {
		return columnType;
	}

	public void setColumnType(Integer columnType) {
		this.columnType = columnType;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		String toStringStr = null;

		switch (columnType) {
		case 0:
			toStringStr = columnName + " varchar(" + columnLength + ") DEFAULT NULL COMMENT '" + columnNameCN + "'";
			break;
		case 1:
			toStringStr = columnName + " varchar(" + columnLength + ") NOT NULL COMMENT '" + columnNameCN
					+ "', PRIMARY KEY (" + columnName + ")";
			break;
		case 2:
			toStringStr = columnName + " varchar(" + columnLength + ") DEFAULT NULL COMMENT '" + columnNameCN
					+ "', KEY INDEX_" + columnName + " (" + columnName + ")";
			break;
		default:
			break;
		}

		return toStringStr;
	}

}