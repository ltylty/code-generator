package com.enableets.edu.${moudleName}.microservice.bo;

/**
 * ${tblName}
 */
public class ${className}BO {
	
	#foreach($_pk in $pks)
	/**
	 * $_pk.lowerCaseFieldCol
	 */	
	private $_pk.typeCol $_pk.lowerCaseFieldCol;

	#end
	#foreach($s in $propertys)
	/**
	 * $s.lowerCaseFieldCol
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