package com.shit.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.shit.user.api.service.UserService;
import com.shit.user.common.domain.User;
import com.shit.user.dao.mapper.UserMapper;

/**
 * @TODO
 * @author Long
 * @date 2017年8月11日下午5:26:41
 */
@Service()
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void test(String name) {
		System.out.println("----------"+name+"--------");
	}
	
	@Override
	public User findOne(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> findAll() {
		return userMapper.selectAllUser();
	}

}
