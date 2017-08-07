package com.enableets.edu.notification.framework.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * notification_recipient
 */
@Entity
@Table(name = "notification_recipient")
public class NotificationRecipientPO {
	
	/**
	 * notificationId
	 */	
	@Id
	@Column(name="notification_id")
	private String notificationId;

	/**
	 * recipient
	 */	
	@Id
	@Column(name="recipient")
	private String recipient;

	/**
	 * recipientName
	 */	
	@Column(name="recipient_name")
	private String recipientName;

	/**
	 * status
	 */	
	@Column(name="status")
	private String status;

	/**
	 * readTime
	 */	
	@Column(name="read_time")
	private java.util.Date readTime;

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
