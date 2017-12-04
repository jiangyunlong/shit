package com.shit.log.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shit.log.common.domain.Log;
import com.shit.log.dao.mapper.LogMapper;
import com.shit.user.api.service.UserService;

/**
 * @TODO
 * @author Long
 * @date 2017年11月23日下午6:36:37
 */
@RestController
@RequestMapping("/log")
public class LogController {

	@Resource
	private LogMapper logMapper;
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void findOne(Log log){
		log.setCreated(new Date());
		logMapper.add(log);
	}
	
	@RequestMapping("/list")
	public List<Log> getAll(){
		userService.test("xxxxxxxxxxxxx");
		return logMapper.getAll();
	}
	
}
