package com.shit.quartz.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @TODO
 * @author Long
 * @date 2018年5月3日下午4:29:24
 */
public class HelloJob2 implements Job{
	
	private Logger logger = LoggerFactory.getLogger(HelloJob2.class);  
	
	/*public void execute() throws JobExecutionException {
		
		System.out.println("==========2222222222222222222222==========");
		logger.info("Hello Job2执行时间: " + new Date());
	}*/

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("==========2222222222222222222222==========");
		logger.info("Hello Job2执行时间: " + new Date());
	}

}
