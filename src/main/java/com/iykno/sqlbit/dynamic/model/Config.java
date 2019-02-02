package com.iykno.sqlbit.dynamic.model;

import java.util.Date;
import java.util.List;

public class Config {
    private Integer configId;

    private String tableName;

    private String tableNameCN;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String description;

    private Integer mark;

    private List<ColumnConfig> colmnConfigList;
    
    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getTableNameCN() {
        return tableNameCN;
    }

    public void setTableNameCN(String tableNameCN) {
        this.tableNameCN = tableNameCN == null ? null : tableNameCN.trim();
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

	public List<ColumnConfig> getColmnConfigList() {
		return colmnConfigList;
	}

	public void setColmnConfigList(List<ColumnConfig> colmnConfigList) {
		this.colmnConfigList = colmnConfigList;
	}
    
}