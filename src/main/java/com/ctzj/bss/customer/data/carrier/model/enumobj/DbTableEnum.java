package com.ctzj.bss.customer.data.carrier.model.enumobj;

public enum DbTableEnum {
	A("ogg_a_change_logs", "dataSourceA"), 
	B("ogg_b_change_logs", "dataSourceB"), 
	C("ogg_c_change_logs", "dataSourceC");

	private String tableName;

	private String dataSource;

	private DbTableEnum(String tableName, String dataSource) {
		this.tableName = tableName;
		this.dataSource = dataSource;
	}

	public String getTableName() {
		return tableName.toUpperCase();
	}

	public String getDataSource() {
		return dataSource;
	}

	public static DbTableEnum getEnumByName(String name) {
		for(DbTableEnum dbTableEnum:DbTableEnum.values()){
			if(dbTableEnum.name().equals(name))
				return dbTableEnum;
		}
		return null;
	}
}
