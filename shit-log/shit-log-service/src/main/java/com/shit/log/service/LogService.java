package com.shit.log.service;

import java.util.List;

import com.shit.log.common.domain.Log;

/**
 * @TODO
 * @author Long
 * @date 2017年11月23日下午6:31:29
 */
public interface LogService {

	void add(Log log);
	
	List<Log> getAll();
}
