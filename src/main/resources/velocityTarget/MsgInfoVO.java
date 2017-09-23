package com.enableets.edu.message.microservice.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author toy_liu@enable-ets.com
 * 2017/09/23
 */
@ApiModel
public class MsgInfoVO {
	
	/**
	 * 主键标识
	 */	
	@ApiModelProperty(value = "主键标识")
	private String msgId;

	/**
	 * 发送者
	 */	
	@ApiModelProperty(value = "发送者")
	private String sender;

	/**
	 * 发送者用户标识
	 */	
	@ApiModelProperty(value = "发送者用户标识")
	private String senderUserId;

	/**
	 * 接收对象
	 */	
	@ApiModelProperty(value = "接收对象")
	private String recipients;

	/**
	 * 主题
	 */	
	@ApiModelProperty(value = "主题")
	private String subject;

	/**
	 * 字符集编码
	 */	
	@ApiModelProperty(value = "字符集编码")
	private String charset;

	/**
	 * 内容类型
	 */	
	@ApiModelProperty(value = "内容类型")
	private String contentType;

	/**
	 * 内容
	 */	
	@ApiModelProperty(value = "内容")
	private String body;


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

}
