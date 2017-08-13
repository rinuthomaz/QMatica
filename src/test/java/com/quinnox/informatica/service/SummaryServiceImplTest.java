package com.quinnox.informatica.service;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.quinnox.informatica.Application;
import com.quinnox.informatica.model.Data;



/**
 * @author rinut
 * 13-Aug-2017
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Application.class })
@TestPropertySource(locations = "classpath:application-test.properties")
public class SummaryServiceImplTest {

	@Autowired
	private SummaryService summaryService;
	private List<String> processStatus;

	@Test
	public void findByProcessStatusNew() {
		processStatus = null;
		processStatus.add("RUNNIING");
		Data data = summaryService.findByProcessStatusNew(processStatus);
		Assert.assertNotNull(data);
	}
	
	@Test
	public void test() {
		String test = "test";
		Assert.assertEquals(test, "test");
	}

}
