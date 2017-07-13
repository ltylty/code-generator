package com.enableets.edu.billing.microservice.bo;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * billing_amount_change_log
 */
@JsonInclude(JsonInclude.Include.NON_NULL) 
@ApiModel
public class AmountChangeLogBO {
	
	/**
	 * id
	 */	
	@ApiModelProperty(hidden = false)
	private Long id;

	/**
	 * amount
	 */	
	@ApiModelProperty(hidden = false)
	private Float amount;

	/**
	 * fromUserId
	 */	
	@ApiModelProperty(hidden = false)
	private String fromUserId;

	/**
	 * toUserId
	 */	
	@ApiModelProperty(hidden = false)
	private String toUserId;

	/**
	 * payType
	 */	
	@ApiModelProperty(hidden = false)
	private String payType;

	/**
	 * description
	 */	
	@ApiModelProperty(hidden = false)
	private String description;

	/**
	 * createTime
	 */	
	@ApiModelProperty(hidden = false)
	private java.util.Date createTime;

	/**
	 * updateTime
	 */	
	@ApiModelProperty(hidden = false)
	private java.util.Date updateTime;


	 /**
	 * @return the id
	 */		
	public Long getId() {
		return id;
	}

	 /**
	 * @param id the id to set
	 */	
	public void setId(Long id) {
		this.id = id;
	}



	 /**
	 * @return the amount
	 */		
	public Float getAmount() {
		return amount;
	}
	
	 /**
	 * @param amount the amount to set
	 */	
	public void setAmount(Float amount) {
		this.amount = amount;
	}

	 /**
	 * @return the fromUserId
	 */		
	public String getFromUserId() {
		return fromUserId;
	}
	
	 /**
	 * @param fromUserId the fromUserId to set
	 */	
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	 /**
	 * @return the toUserId
	 */		
	public String getToUserId() {
		return toUserId;
	}
	
	 /**
	 * @param toUserId the toUserId to set
	 */	
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	 /**
	 * @return the payType
	 */		
	public String getPayType() {
		return payType;
	}
	
	 /**
	 * @param payType the payType to set
	 */	
	public void setPayType(String payType) {
		this.payType = payType;
	}

	 /**
	 * @return the description
	 */		
	public String getDescription() {
		return description;
	}
	
	 /**
	 * @param description the description to set
	 */	
	public void setDescription(String description) {
		this.description = description;
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
