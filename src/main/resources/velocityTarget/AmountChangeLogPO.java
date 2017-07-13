package com.enableets.edu.billing.framework.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * billing_amount_change_log
 */
@Entity
@Table(name = "billing_amount_change_log")
public class AmountChangeLogPO {
	
	/**
	 * id
	 */	
	@Id
	@Column(name="id")
	private Long id;

	/**
	 * amount
	 */	
	@Column(name="amount")
	private Float amount;

	/**
	 * fromUserId
	 */	
	@Column(name="from_user_id")
	private String fromUserId;

	/**
	 * toUserId
	 */	
	@Column(name="to_user_id")
	private String toUserId;

	/**
	 * payType
	 */	
	@Column(name="pay_type")
	private String payType;

	/**
	 * description
	 */	
	@Column(name="description")
	private String description;

	/**
	 * createTime
	 */	
	@Column(name="create_time")
	private java.util.Date createTime;

	/**
	 * updateTime
	 */	
	@Column(name="update_time")
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
