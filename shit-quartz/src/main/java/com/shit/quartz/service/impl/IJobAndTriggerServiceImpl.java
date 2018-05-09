package com.shit.quartz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shit.quartz.dao.JobAndTriggerMapper;
import com.shit.quartz.model.JobAndTrigger;
import com.shit.quartz.service.IJobAndTriggerService;

/**
 * @TODO
 * @author Long
 * @date 2018年5月3日下午4:38:47
 */
@Service
public class IJobAndTriggerServiceImpl implements IJobAndTriggerService{

	@Autowired
	private JobAndTriggerMapper jobAndTriggerMapper;
	
	public List<JobAndTrigger> getJobAndTriggerDetails() {
		return jobAndTriggerMapper.getJobAndTriggerDetails();
	}

}
