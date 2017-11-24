package com.shit.log.dao.mapper;

import java.util.List;

import com.shit.log.common.domain.Log;

/**
 * @TODO
 * @author Long
 * @date 2017年11月23日下午6:29:19
 */
public interface LogMapper {
	
	void add(Log log);
	
	List<Log> getAll();

}
