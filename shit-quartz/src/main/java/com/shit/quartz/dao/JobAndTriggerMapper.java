package com.shit.quartz.dao;

import java.util.List;

import com.shit.quartz.model.JobAndTrigger;

/**
 * @TODO
 * @author Long
 * @date 2018年5月3日下午4:39:56
 */
public interface JobAndTriggerMapper {

	public List<JobAndTrigger> getJobAndTriggerDetails();
}
