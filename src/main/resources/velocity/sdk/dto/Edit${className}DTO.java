package com.enableets.edu.sdk.${moudleName}.dto;


/**
 * @author toy_liu@enable-ets.com
 * ${currDate}
 */
public class Edit${className}DTO {
	
	#foreach($_pk in $pks)
	/**
	 * $_pk.comment
	 */	
	private $_pk.typeCol $_pk.lowerCaseFieldCol;

	#end
	#foreach($s in $propertys)
	#if($s.lowerCaseFieldCol == "creator")
       #break 
    #end
	/**
	 * $s.comment
	 */	
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

}