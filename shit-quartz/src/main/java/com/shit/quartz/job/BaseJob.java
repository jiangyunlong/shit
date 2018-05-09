package com.shit.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @TODO
 * @author Long
 * @date 2018年5月3日下午4:27:53
 */
public interface BaseJob extends Job{

	public void execute(JobExecutionContext context) throws JobExecutionException;
}
