package com.shit.log.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shit.log.common.domain.Log;
import com.shit.log.dao.mapper.LogMapper;
import com.shit.log.service.LogService;

/**
 * @TODO
 * @author Long
 * @date 2017年11月23日下午6:32:03
 */
@Service
public class LogServiceImpl implements LogService{

	@Resource
	private LogMapper logMapper;
	
	public void add(Log log) {
		logMapper.add(log);
	}

	public List<Log> getAll() {
		return logMapper.getAll();
	}

}
