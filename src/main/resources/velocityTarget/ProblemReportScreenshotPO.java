package com.enableets.edu.learning.framework.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * learning_problem_report_screenshot
 */
@Entity
@Table(name = "learning_problem_report_screenshot")
public class ProblemReportScreenshotPO {
	
	/**
	 * id
	 */	
	@Id
	@Column(name="id")
	private java.lang.Long id;

	/**
	 * problemReportId
	 */	
	@Column(name="problem_report_id")
	private java.lang.Long problemReportId;

	/**
	 * fileId
	 */	
	@Column(name="file_id")
	private java.lang.String fileId;

	/**
	 * fileName
	 */	
	@Column(name="file_name")
	private java.lang.String fileName;

	/**
	 * fileUrl
	 */	
	@Column(name="file_url")
	private java.lang.String fileUrl;


	 /**
	 * @return the id
	 */		
	public java.lang.Long getId() {
		return id;
	}

	 /**
	 * @param id the id to set
	 */	
	public void setId(java.lang.Long id) {
		this.id = id;
	}



	 /**
	 * @return the problemReportId
	 */		
	public java.lang.Long getProblemReportId() {
		return problemReportId;
	}
	
	 /**
	 * @param problemReportId the problemReportId to set
	 */	
	public void setProblemReportId(java.lang.Long problemReportId) {
		this.problemReportId = problemReportId;
	}

	 /**
	 * @return the fileId
	 */		
	public java.lang.String getFileId() {
		return fileId;
	}
	
	 /**
	 * @param fileId the fileId to set
	 */	
	public void setFileId(java.lang.String fileId) {
		this.fileId = fileId;
	}

	 /**
	 * @return the fileName
	 */		
	public java.lang.String getFileName() {
		return fileName;
	}
	
	 /**
	 * @param fileName the fileName to set
	 */	
	public void setFileName(java.lang.String fileName) {
		this.fileName = fileName;
	}

	 /**
	 * @return the fileUrl
	 */		
	public java.lang.String getFileUrl() {
		return fileUrl;
	}
	
	 /**
	 * @param fileUrl the fileUrl to set
	 */	
	public void setFileUrl(java.lang.String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
