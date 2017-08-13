/**
 * 
 */
package com.quinnox.informatica.model;

import java.util.Date;

/**
 * @author rinut
 * 13-Aug-2017
 * 
 */

public class AuditSummaryModel {
	
	private long processId;
	private String workflowName;
	private String processName;
	private Long childPid;
	private String processCmd;
	private String processType;
	private String processExecType;
	private Date processStartTime;
	private Date processEndTime;
	private String processStatus;
	private String srcSystem;
	private String serverName;
	private String userId;
	private Long osPid;
	private String notifyInd;
	private String errorStatus;
	private String errorDesc;
	
	
	/**
	 * @return the processId
	 */
	public long getProcessId() {
		return processId;
	}
	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(long processId) {
		this.processId = processId;
	}
	/**
	 * @return the workflowName
	 */
	public String getWorkflowName() {
		return workflowName;
	}
	/**
	 * @param workflowName the workflowName to set
	 */
	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
	}
	/**
	 * @return the processName
	 */
	public String getProcessName() {
		return processName;
	}
	/**
	 * @param processName the processName to set
	 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	/**
	 * @return the childPid
	 */
	public Long getChildPid() {
		return childPid;
	}
	/**
	 * @param childPid the childPid to set
	 */
	public void setChildPid(Long childPid) {
		this.childPid = childPid;
	}
	/**
	 * @return the processCmd
	 */
	public String getProcessCmd() {
		return processCmd;
	}
	/**
	 * @param processCmd the processCmd to set
	 */
	public void setProcessCmd(String processCmd) {
		this.processCmd = processCmd;
	}
	/**
	 * @return the processType
	 */
	public String getProcessType() {
		return processType;
	}
	/**
	 * @param processType the processType to set
	 */
	public void setProcessType(String processType) {
		this.processType = processType;
	}
	/**
	 * @return the processExecType
	 */
	public String getProcessExecType() {
		return processExecType;
	}
	/**
	 * @param processExecType the processExecType to set
	 */
	public void setProcessExecType(String processExecType) {
		this.processExecType = processExecType;
	}
	/**
	 * @return the processStartTime
	 */
	public Date getProcessStartTime() {
		return processStartTime;
	}
	/**
	 * @param processStartTime the processStartTime to set
	 */
	public void setProcessStartTime(Date processStartTime) {
		this.processStartTime = processStartTime;
	}
	/**
	 * @return the processEndTime
	 */
	public Date getProcessEndTime() {
		return processEndTime;
	}
	/**
	 * @param processEndTime the processEndTime to set
	 */
	public void setProcessEndTime(Date processEndTime) {
		this.processEndTime = processEndTime;
	}
	/**
	 * @return the processStatus
	 */
	public String getProcessStatus() {
		return processStatus;
	}
	/**
	 * @param processStatus the processStatus to set
	 */
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	/**
	 * @return the srcSystem
	 */
	public String getSrcSystem() {
		return srcSystem;
	}
	/**
	 * @param srcSystem the srcSystem to set
	 */
	public void setSrcSystem(String srcSystem) {
		this.srcSystem = srcSystem;
	}
	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}
	/**
	 * @param serverName the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the osPid
	 */
	public Long getOsPid() {
		return osPid;
	}
	/**
	 * @param osPid the osPid to set
	 */
	public void setOsPid(Long osPid) {
		this.osPid = osPid;
	}
	/**
	 * @return the notifyInd
	 */
	public String getNotifyInd() {
		return notifyInd;
	}
	/**
	 * @param notifyInd the notifyInd to set
	 */
	public void setNotifyInd(String notifyInd) {
		this.notifyInd = notifyInd;
	}
	/**
	 * @return the errorStatus
	 */
	public String getErrorStatus() {
		return errorStatus;
	}
	/**
	 * @param errorStatus the errorStatus to set
	 */
	public void setErrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}
	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}
	/**
	 * @param errorDesc the errorDesc to set
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	

	
}
