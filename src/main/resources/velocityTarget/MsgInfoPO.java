package com.enableets.edu.message.framework.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author toy_liu@enable-ets.com
 * 2017/09/23
 */
@Entity
@Table(name = "msg_info")
public class MsgInfoPO {
	
	/**
	 * 主键标识
	 */	
	@Id
	@Column(name="msg_id")
	private String msgId;

	/**
	 * 发送者
	 */	
	@Column(name="sender")
	private String sender;

	/**
	 * 发送者用户标识
	 */	
	@Column(name="sender_user_id")
	private String senderUserId;

	/**
	 * 接收对象
	 */	
	@Column(name="recipients")
	private String recipients;

	/**
	 * 主题
	 */	
	@Column(name="subject")
	private String subject;

	/**
	 * 字符集编码
	 */	
	@Column(name="charset")
	private String charset;

	/**
	 * 内容类型
	 */	
	@Column(name="content_type")
	private String contentType;

	/**
	 * 内容
	 */	
	@Column(name="body")
	private String body;

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
	 * @return the msgId
	 */		
	public String getMsgId() {
		return msgId;
	}

	 /**
	 * @param msgId the msgId to set
	 */	
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}



	 /**
	 * @return the sender
	 */		
	public String getSender() {
		return sender;
	}
	
	 /**
	 * @param sender the sender to set
	 */	
	public void setSender(String sender) {
		this.sender = sender;
	}

	 /**
	 * @return the senderUserId
	 */		
	public String getSenderUserId() {
		return senderUserId;
	}
	
	 /**
	 * @param senderUserId the senderUserId to set
	 */	
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

	 /**
	 * @return the recipients
	 */		
	public String getRecipients() {
		return recipients;
	}
	
	 /**
	 * @param recipients the recipients to set
	 */	
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}

	 /**
	 * @return the subject
	 */		
	public String getSubject() {
		return subject;
	}
	
	 /**
	 * @param subject the subject to set
	 */	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	 /**
	 * @return the charset
	 */		
	public String getCharset() {
		return charset;
	}
	
	 /**
	 * @param charset the charset to set
	 */	
	public void setCharset(String charset) {
		this.charset = charset;
	}

	 /**
	 * @return the contentType
	 */		
	public String getContentType() {
		return contentType;
	}
	
	 /**
	 * @param contentType the contentType to set
	 */	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	 /**
	 * @return the body
	 */		
	public String getBody() {
		return body;
	}
	
	 /**
	 * @param body the body to set
	 */	
	public void setBody(String body) {
		this.body = body;
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
