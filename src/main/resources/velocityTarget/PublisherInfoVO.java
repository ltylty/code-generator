package com.enableets.edu.textbook.microservice.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * publisher_info
 */
@ApiModel
public class PublisherInfoVO {
	
	/**
	 * publisherId
	 */	
	@ApiModelProperty
	private String publisherId;

	/**
	 * publisherName
	 */	
	@ApiModelProperty
	private String publisherName;

	/**
	 * creator
	 */	
	@ApiModelProperty
	private String creator;

	/**
	 * createTime
	 */	
	@ApiModelProperty
	private java.util.Date createTime;

	/**
	 * updator
	 */	
	@ApiModelProperty
	private String updator;

	/**
	 * updateTime
	 */	
	@ApiModelProperty
	private java.util.Date updateTime;


	 /**
	 * @return the publisherId
	 */		
	public String getPublisherId() {
		return publisherId;
	}

	 /**
	 * @param publisherId the publisherId to set
	 */	
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}



	 /**
	 * @return the publisherName
	 */		
	public String getPublisherName() {
		return publisherName;
	}
	
	 /**
	 * @param publisherName the publisherName to set
	 */	
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
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

}
