package com.enableets.edu.teaching.microservice.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author toy_liu@enable-ets.com
 * 2018/03/16
 */
@ApiModel
public class QueryTeachingPackageResultVO {
	
	/**
	 * 资源id
	 */	
	@ApiModelProperty(value = "资源id")
	private String contentId;

	/**
	 * 资源名称
	 */	
	@ApiModelProperty(value = "资源名称")
	private String name;

	/**
	 * 教学计划id
	 */	
	@ApiModelProperty(value = "教学计划id")
	private String teachingProgramId;

	/**
	 * 目录id
	 */	
	@ApiModelProperty(value = "目录id")
	private String catalogId;

	/**
	 * 目录名称
	 */	
	@ApiModelProperty(value = "目录名称")
	private String catalogName;

	/**
	 * 开始课时
	 */	
	@ApiModelProperty(value = "开始课时")
	private Long startClassHour;

	/**
	 * 结束课时
	 */	
	@ApiModelProperty(value = "结束课时")
	private Long endClassHour;

	/**
	 * 所需课时
	 */	
	@ApiModelProperty(value = "所需课时")
	private Long requireClassHour;


	 /**
	 * @return the contentId
	 */		
	public String getContentId() {
		return contentId;
	}

	 /**
	 * @param contentId the contentId to set
	 */	
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}



	 /**
	 * @return the name
	 */		
	public String getName() {
		return name;
	}
	
	 /**
	 * @param name the name to set
	 */	
	public void setName(String name) {
		this.name = name;
	}

	 /**
	 * @return the teachingProgramId
	 */		
	public String getTeachingProgramId() {
		return teachingProgramId;
	}
	
	 /**
	 * @param teachingProgramId the teachingProgramId to set
	 */	
	public void setTeachingProgramId(String teachingProgramId) {
		this.teachingProgramId = teachingProgramId;
	}

	 /**
	 * @return the catalogId
	 */		
	public String getCatalogId() {
		return catalogId;
	}
	
	 /**
	 * @param catalogId the catalogId to set
	 */	
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	 /**
	 * @return the catalogName
	 */		
	public String getCatalogName() {
		return catalogName;
	}
	
	 /**
	 * @param catalogName the catalogName to set
	 */	
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	 /**
	 * @return the startClassHour
	 */		
	public Long getStartClassHour() {
		return startClassHour;
	}
	
	 /**
	 * @param startClassHour the startClassHour to set
	 */	
	public void setStartClassHour(Long startClassHour) {
		this.startClassHour = startClassHour;
	}

	 /**
	 * @return the endClassHour
	 */		
	public Long getEndClassHour() {
		return endClassHour;
	}
	
	 /**
	 * @param endClassHour the endClassHour to set
	 */	
	public void setEndClassHour(Long endClassHour) {
		this.endClassHour = endClassHour;
	}

	 /**
	 * @return the requireClassHour
	 */		
	public Long getRequireClassHour() {
		return requireClassHour;
	}
	
	 /**
	 * @param requireClassHour the requireClassHour to set
	 */	
	public void setRequireClassHour(Long requireClassHour) {
		this.requireClassHour = requireClassHour;
	}

}
