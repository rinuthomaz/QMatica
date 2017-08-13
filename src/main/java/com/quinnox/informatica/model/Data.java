/**
 * 
 */
package com.quinnox.informatica.model;

import java.util.List;

/**
 * @author rinut
 * 13-Aug-2017
 * 
 */
public class Data {
	
	private String msg;
	private List<AuditSummaryModel> auditSummaryModel;
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the auditSummaryModel
	 */
	public List<AuditSummaryModel> getAuditSummaryModel() {
		return auditSummaryModel;
	}
	/**
	 * @param auditSummaryModel the auditSummaryModel to set
	 */
	public void setAuditSummaryModel(List<AuditSummaryModel> auditSummaryModel) {
		this.auditSummaryModel = auditSummaryModel;
	}
	
	
	
	

}
