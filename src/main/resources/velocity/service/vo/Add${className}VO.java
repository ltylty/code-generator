package com.enableets.edu.${moudleName}.microservice.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
@ApiModel
public class Add${className}VO {
	
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

}