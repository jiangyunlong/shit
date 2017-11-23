package com.shit.user.facade.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shit.user.common.domain.User;
import com.shit.user.dao.mapper.UserMapper;

/**
 * @TODO
 * @author Long
 * @date 2017年8月11日下午5:27:21
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserMapper userMapper;
	
	@RequestMapping("/{id}")
	public User findOne(@PathVariable("id") Long id){
		return userMapper.selectByPrimaryKey(id);
	}
	
	@RequestMapping("/list")
	public List<User> findAll(){
		return userMapper.selectAllUser();
	}
}
