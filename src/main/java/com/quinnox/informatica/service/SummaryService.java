/**
 * 
 */
package com.quinnox.informatica.service;

import java.util.List;

import com.quinnox.informatica.model.AuditSummaryModel;
import com.quinnox.informatica.model.Data;


/**
 * @author rinut
 * 13-Aug-2017
 * 
 */
public interface SummaryService {
	
	public List<AuditSummaryModel> findByProcessStatus(List<String> processStatus);
	
	public Data findByProcessStatusNew(List<String> processStatus);
	
}
