package com.util;

public class PropertyVo {

	/**
	 * 数据库表名
	 */
	private String lowerCaseTableName;
	/**
	 * 数据库表字段名
	 */
	private String fieldOriginal;
	/**
	 * 字段名  字段名 例：menu_id --> menuId
	 */
	private String lowerCaseFieldCol;
	/**
	 * 字段类型
	 */
	private String typeCol;
	/**
	 * 是否为空
	 */
	private String nullCol;
	/**
	 * 是否为主键
	 */
	private String keyCol;
	/**
	 * 默认值
	 */
	private Object DefaultCol;
	/**
	 * 额外信息
	 */
	private String extraCol;
	/**
	 * 字段名 例：menu_id --> MenuId
	 */
	private String UpperCaseFieldCol;
	
	
	public PropertyVo(String lowerCaseTableName,Object lowerCaseFieldCol, Object typeCol, Object nullCol,
			Object keyCol, Object DefaultCol, Object extraCol) {
		this.lowerCaseTableName = lowerCaseTableName;
		this.lowerCaseFieldCol = lowerCaseFieldCol!=null?lowerCaseFieldCol.toString():null;
		this.typeCol = typeCol!=null?typeCol.toString():null;
		this.nullCol = nullCol!=null?nullCol.toString():null;
		this.keyCol = keyCol!=null?keyCol.toString():null;
		this.DefaultCol = DefaultCol;
		this.extraCol = extraCol!=null?extraCol.toString():null;
	}
	
	public PropertyVo() {}
	
	
	public String getTypeCol() {
		return typeCol;
	}
	public void setTypeCol(String typeCol) {
		this.typeCol = typeCol;
	}
	public String getNullCol() {
		return nullCol;
	}
	public void setNullCol(String nullCol) {
		this.nullCol = nullCol;
	}
	public String getKeyCol() {
		return keyCol;
	}
	public void setKeyCol(String keyCol) {
		this.keyCol = keyCol;
	}
	public Object getDefaultCol() {
		return DefaultCol;
	}
	public void setDefaultCol(Object defaultCol) {
		DefaultCol = defaultCol;
	}
	public String getExtraCol() {
		return extraCol;
	}
	public void setExtraCol(String extraCol) {
		this.extraCol = extraCol;
	}

	public String getLowerCaseTableName() {
		return lowerCaseTableName;
	}

	public void setLowerCaseTableName(String lowerCaseTableName) {
		this.lowerCaseTableName = lowerCaseTableName;
	}

	public String getFieldOriginal() {
		return fieldOriginal;
	}

	public void setFieldOriginal(String fieldOriginal) {
		this.fieldOriginal = fieldOriginal;
	}

	public String getUpperCaseFieldCol() {
		return UpperCaseFieldCol;
	}

	public void setUpperCaseFieldCol(String upperCaseFieldCol) {
		UpperCaseFieldCol = upperCaseFieldCol;
	}

	public String getLowerCaseFieldCol() {
		return lowerCaseFieldCol;
	}

	public void setLowerCaseFieldCol(String lowerCaseFieldCol) {
		this.lowerCaseFieldCol = lowerCaseFieldCol;
	}

}
