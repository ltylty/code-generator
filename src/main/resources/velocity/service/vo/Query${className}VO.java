package com.enableets.edu.${moudleName}.microservice.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
@ApiModel
public class Query${className}VO {
	
	#foreach($_pk in $pks)
	/**
	 * $_pk.comment
	 */	
	@ApiModelProperty(value = "$_pk.comment")
	private $_pk.typeCol $_pk.lowerCaseFieldCol;

	#end
	#foreach($s in $propertys)
	#if($s.lowerCaseFieldCol == "creator")
       #break 
    #end
	/**
	 * $s.comment
	 */	
	@ApiModelProperty(value = "$s.comment")
	private $s.typeCol $s.lowerCaseFieldCol;

	#end
	#if(!$isMulti)
	#foreach($_pk in $pks)	

	 /**
	 * @return the ${_pk.lowerCaseFieldCol}
	 */		
	public $_pk.typeCol get${_pk.UpperCaseFieldCol}() {
		return $_pk.lowerCaseFieldCol;
	}

	 /**
	 * @param $_pk.lowerCaseFieldCol the $_pk.lowerCaseFieldCol to set
	 */	
	public void set${_pk.UpperCaseFieldCol}($_pk.typeCol $_pk.lowerCaseFieldCol) {
		this.$_pk.lowerCaseFieldCol = $_pk.lowerCaseFieldCol;
	}

	#end
	#end
	
	/**
	 * 分页起始位置
	 */
	@ApiModelProperty(value = "分页起始位置")	
	private Integer offset;
	
	/**
	 * 分页行数
	 */
	@ApiModelProperty(value = "分页行数")
	private Integer rows;	
	
	#if($isMulti)
	#foreach($_pk in $pks)
	
	 /**
	 * @return the ${_pk.lowerCaseFieldCol}
	 */	
	public $_pk.typeCol get${_pk.UpperCaseFieldCol}() {
		return $_pk.lowerCaseFieldCol;
	}
	
	 /**
	 * @param $_pk.lowerCaseFieldCol the $_pk.lowerCaseFieldCol to set
	 */	
	public void set${_pk.UpperCaseFieldCol}($_pk.typeCol $_pk.lowerCaseFieldCol) {
		this.$_pk.lowerCaseFieldCol = $_pk.lowerCaseFieldCol;
	}
	#end	
	#end

	#foreach($s in $propertys)
	#if($s.lowerCaseFieldCol == "creator")
	       #break 
	#end

	 /**
	 * @return the $s.lowerCaseFieldCol
	 */		
	public $s.typeCol get${s.UpperCaseFieldCol}() {
		return $s.lowerCaseFieldCol;
	}
	
	 /**
	 * @param $s.lowerCaseFieldCol the $s.lowerCaseFieldCol to set
	 */	
	public void set${s.UpperCaseFieldCol}($s.typeCol $s.lowerCaseFieldCol) {
		this.$s.lowerCaseFieldCol = $s.lowerCaseFieldCol;
	}
	#end

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
}