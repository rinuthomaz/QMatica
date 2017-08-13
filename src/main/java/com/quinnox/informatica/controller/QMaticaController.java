package com.quinnox.informatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.informatica.model.Data;
import com.quinnox.informatica.service.SummaryService;

@RestController
public class QMaticaController {
	
	@Autowired
	private SummaryService summaryService;
    
    @RequestMapping("/welcome")
    public String index() {
        return "Ah! Its loading...";
    }
    
    
    @RequestMapping("/summary/{status}")
	public Data findSummaryByStatus(@PathVariable("status") List<String> status){
		return summaryService.findByProcessStatusNew(status);
	}
    
    
}
