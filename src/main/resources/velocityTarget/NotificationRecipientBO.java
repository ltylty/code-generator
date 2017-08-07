package com.enableets.edu.notification.microservice.bo;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * notification_recipient
 */
@JsonInclude(JsonInclude.Include.NON_NULL) 
@ApiModel
public class NotificationRecipientBO {
	
	/**
	 * notificationId
	 */	
	@ApiModelProperty(hidden = false)
	private String notificationId;

	/**
	 * recipient
	 */	
	@ApiModelProperty(hidden = false)
	private String recipient;

	/**
	 * recipientName
	 */	
	@ApiModelProperty(hidden = false)
	private String recipientName;

	/**
	 * status
	 */	
	@ApiModelProperty(hidden = false)
	private String status;

	/**
	 * readTime
	 */	
	@ApiModelProperty(hidden = false)
	private java.util.Date readTime;

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
	 * @return the notificationId
	 */	
	public String getNotificationId() {
		return notificationId;
	}
	
	 /**
	 * @param notificationId the notificationId to set
	 */	
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	
	 /**
	 * @return the recipient
	 */	
	public String getRecipient() {
		return recipient;
	}
	
	 /**
	 * @param recipient the recipient to set
	 */	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


	 /**
	 * @return the recipientName
	 */		
	public String getRecipientName() {
		return recipientName;
	}
	
	 /**
	 * @param recipientName the recipientName to set
	 */	
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	 /**
	 * @return the status
	 */		
	public String getStatus() {
		return status;
	}
	
	 /**
	 * @param status the status to set
	 */	
	public void setStatus(String status) {
		this.status = status;
	}

	 /**
	 * @return the readTime
	 */		
	public java.util.Date getReadTime() {
		return readTime;
	}
	
	 /**
	 * @param readTime the readTime to set
	 */	
	public void setReadTime(java.util.Date readTime) {
		this.readTime = readTime;
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
