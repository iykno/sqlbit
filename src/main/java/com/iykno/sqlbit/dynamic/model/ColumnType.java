package com.iykno.sqlbit.dynamic.model;

public enum ColumnType {
	// 0:普通 1：主键 2：索引
	Normal(0, "Normal"), Primary(1, "Primary"), Index(2, "Index");
	private int value;
	private String name;

	private ColumnType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}
