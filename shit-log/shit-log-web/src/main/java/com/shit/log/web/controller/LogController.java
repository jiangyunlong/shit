package com.shit.log.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.jms.Queue;
import javax.jms.Topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
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
	
	final static Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue1;
	
	@Autowired
	private Queue queue2;
	
	@Autowired
	private Topic topic1;
	
	@Resource
	private LogMapper logMapper;
	
	@Reference
	private UserService userService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void findOne(Log log){
		log.setCreated(new Date());
		logMapper.add(log);
	}
	
	@RequestMapping("/list")
	public List<Log> getAll(){
		
		logger.info("get all log list.");
		userService.test("xxxxxxxxxxxxx");
		return logMapper.getAll();
	}
	
	@RequestMapping("/redis")
	public void redis(){
		stringRedisTemplate.opsForValue().set("aaa", "111");
		System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
	}
	
	@RequestMapping("/sendMQ")
	public void mq(){
    	logger.info("-----------------------send-----------------------");
    	List<String> list = new ArrayList<String>();
    	for(int i=0;i<10;i++){
    		list.add("hello"+i);
    		this.jmsMessagingTemplate.convertAndSend(queue1, list);
    		this.jmsMessagingTemplate.convertAndSend(queue2, "22222hi,activeMQ"+i);
    		this.jmsMessagingTemplate.convertAndSend(topic1, "11111hi,topicMQ"+i);
    	}
	}
	
}
