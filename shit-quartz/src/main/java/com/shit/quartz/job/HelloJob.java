package com.shit.quartz.job;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @TODO
 * @author Long
 * @date 2018年5月3日下午4:29:24
 */
public class HelloJob implements BaseJob{
	
	private Logger logger = LoggerFactory.getLogger(HelloJob.class);  

	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		System.out.println("====================");
		logger.info("Hello Job执行时间: " + new Date());
	}

}
