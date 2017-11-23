package com.shit.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shit.user.common.domain.User;
import com.shit.user.dao.mapper.UserMapper;
import com.shit.user.service.UserService;

/**
 * @TODO
 * @author Long
 * @date 2017年8月11日下午5:26:41
 */
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User findOne(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> findAll() {
		return userMapper.selectAllUser();
	}

}
