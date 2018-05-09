package com.shit.quartz.service;

import java.util.List;

import com.shit.quartz.model.JobAndTrigger;

/**
 * @TODO
 * @author Long
 * @date 2018年5月3日下午4:37:50
 */
public interface IJobAndTriggerService {

	public List<JobAndTrigger> getJobAndTriggerDetails();
}
