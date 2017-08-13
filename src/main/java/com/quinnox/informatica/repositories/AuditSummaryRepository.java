/**
 * 
 */
package com.quinnox.informatica.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.quinnox.informatica.domain.AuditSummary;

/**
 * @author rinut
 * 13-Aug-2017
 * 
 */
public interface AuditSummaryRepository extends CrudRepository<AuditSummary, String>{
	
	List<AuditSummary> findByProcessStatus(List<String> processStatus);
	
}
