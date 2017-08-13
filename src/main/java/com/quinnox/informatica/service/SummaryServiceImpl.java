/**
 * 
 */
package com.quinnox.informatica.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.quinnox.informatica.domain.AuditSummary;
import com.quinnox.informatica.model.AuditSummaryModel;
import com.quinnox.informatica.model.Data;
import com.quinnox.informatica.repositories.AuditSummaryRepository;

/**
 * @fileName EquipmentServiceImpl.java
 * @author rthoma24
 * @Project dei
 * @Date Jul 26, 2016
 * @Sprint
 * @UserStory
 * @Theme EquipmentServiceImpl
 * 
 */

@Transactional
@Service
public class SummaryServiceImpl implements SummaryService {
	
	Logger LOGGER = LoggerFactory
			.getLogger("com.dei.service.EquipmentServiceImpl");

	
	@Autowired
	private AuditSummaryRepository auditSummaryRepository;

	
	/* (non-Javadoc)
	 * @see com.quinnox.informatica.service.SummaryService#findByProcessStatus(java.util.List)
	 */
	@Override
	public List<AuditSummaryModel> findByProcessStatus(List<String> processStatuses) {
		
		List<AuditSummaryModel> auditSummaryModels = new ArrayList<AuditSummaryModel>();
		try {
			List<AuditSummary> auditSummaryLisy = auditSummaryRepository.findByProcessStatus(processStatuses);
			for (AuditSummary auditSummary : auditSummaryLisy) {
				AuditSummaryModel auditSummaryModel = new AuditSummaryModel();
					BeanUtils.copyProperties(auditSummaryModel, auditSummary);
					auditSummaryModels.add(auditSummaryModel);
			}
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
		return auditSummaryModels;
	}


	/* (non-Javadoc)
	 * @see com.quinnox.informatica.service.SummaryService#findByProcessStatusNew(java.util.List)
	 */
	@Override
	public Data findByProcessStatusNew(List<String> processStatus) {
		Data data = new Data();
		data.setMsg("no data");
		List<AuditSummaryModel> auditSummaryModels = new ArrayList<AuditSummaryModel>();
		try {
			List<AuditSummary> auditSummaryLisy = auditSummaryRepository.findByProcessStatus(processStatus);
			for (AuditSummary auditSummary : auditSummaryLisy) {
				AuditSummaryModel auditSummaryModel = new AuditSummaryModel();
					BeanUtils.copyProperties(auditSummaryModel, auditSummary);
					auditSummaryModels.add(auditSummaryModel);
					data.setMsg("Success");
			}
			data.setAuditSummaryModel(auditSummaryModels);
			} catch (IllegalAccessException | InvocationTargetException e) {
				data.setAuditSummaryModel(auditSummaryModels);
				data.setMsg("Failed"+e.getLocalizedMessage());
				e.printStackTrace();
			}
		return data;
	}

}
