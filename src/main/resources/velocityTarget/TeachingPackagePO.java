package com.enableets.edu.teaching.framework.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author toy_liu@enable-ets.com
 * 2018/03/16
 */
@Entity
@Table(name = "teaching_package")
public class TeachingPackagePO {
	
	/**
	 * 资源id
	 */	
	@Id
	@Column(name="content_id")
	private String contentId;

	/**
	 * 资源名称
	 */	
	@Column(name="name")
	private String name;

	/**
	 * 教学计划id
	 */	
	@Column(name="teaching_program_id")
	private String teachingProgramId;

	/**
	 * 目录id
	 */	
	@Column(name="catalog_id")
	private String catalogId;

	/**
	 * 目录名称
	 */	
	@Column(name="catalog_name")
	private String catalogName;

	/**
	 * 开始课时
	 */	
	@Column(name="start_class_hour")
	private Long startClassHour;

	/**
	 * 结束课时
	 */	
	@Column(name="end_class_hour")
	private Long endClassHour;

	/**
	 * 所需课时
	 */	
	@Column(name="require_class_hour")
	private Long requireClassHour;

	/**
	 * 创建者
	 */	
	@Column(name="creator")
	private String creator;

	/**
	 * 创建时间
	 */	
	@Column(name="create_time")
	private java.util.Date createTime;

	/**
	 * 更新者
	 */	
	@Column(name="updator")
	private String updator;

	/**
	 * 更新时间
	 */	
	@Column(name="update_time")
	private java.util.Date updateTime;

	/**
	 * 资源来源的系统编码
	 */	
	@Column(name="provider_code")
	private String providerCode;


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

	 /**
	 * @return the creator
	 */		
	public String getCreator() {
		return creator;
	}
	
	 /**
	 * @param creator the creator to set
	 */	
	public void setCreator(String creator) {
		this.creator = creator;
	}

	 /**
	 * @return the createTime
	 */		
	public java.util.Date getCreateTime() {
		return createTime;
	}
	
	 /**
	 * @param createTime the createTime to set
	 */	
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	 /**
	 * @return the updator
	 */		
	public String getUpdator() {
		return updator;
	}
	
	 /**
	 * @param updator the updator to set
	 */	
	public void setUpdator(String updator) {
		this.updator = updator;
	}

	 /**
	 * @return the updateTime
	 */		
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	
	 /**
	 * @param updateTime the updateTime to set
	 */	
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	 /**
	 * @return the providerCode
	 */		
	public String getProviderCode() {
		return providerCode;
	}
	
	 /**
	 * @param providerCode the providerCode to set
	 */	
	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

}
