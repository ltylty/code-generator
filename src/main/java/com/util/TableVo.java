package com.util;

import java.util.List;

public class TableVo {

	/**
	 * 普通字段属性集
	 */
	private List<PropertyVo> propertyList;
	/**
	 * 表名 例：t_menu --> menu
	 */
	private String lowerCaseTableName;
	/**
	 * 数据库表名
	 */
	private String tableOriginal;
	/**
	 * 主键字段属性集
	 */
	private List<PropertyVo> pks;
	/**
	 * 是否为多主键
	 */
	private boolean isMulti;
	/**
	 * 表名  例：t_menu --> Menu
	 */
	private String UpperCaseTableName;
	
	
	public TableVo parseTableVo(List<PropertyVo> propertyList){
		return UtilTool.parseProperty(propertyList); 
	}
	
	public List<PropertyVo> getPropertyList() {
		return propertyList;
	}
	public void setPropertyList(List<PropertyVo> propertyList) {
		this.propertyList = propertyList;
	}
	public String getLowerCaseTableName() {
		return lowerCaseTableName;
	}

	public void setLowerCaseTableName(String lowerCaseTableName) {
		this.lowerCaseTableName = lowerCaseTableName;
	}

	public List<PropertyVo> getPks() {
		return pks;
	}

	public void setPks(List<PropertyVo> pks) {
		this.pks = pks;
	}

	public boolean isMulti() {
		return isMulti;
	}

	public void setMulti(boolean isMulti) {
		this.isMulti = isMulti;
	}

	public String getTableOriginal() {
		return tableOriginal;
	}

	public void setTableOriginal(String tableOriginal) {
		this.tableOriginal = tableOriginal;
	}

	public String getUpperCaseTableName() {
		return UpperCaseTableName;
	}

	public void setUpperCaseTableName(String upperCaseTableName) {
		UpperCaseTableName = upperCaseTableName;
	}
	
}
