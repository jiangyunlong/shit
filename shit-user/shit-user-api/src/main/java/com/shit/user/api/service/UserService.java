package com.shit.user.api.service;

import java.util.List;

import com.shit.user.common.domain.User;

/**
 * @TODO
 * @author Long
 * @date 2017年8月11日下午5:26:09
 */
public interface UserService {
	
	void test(String name);
	
	User findOne(Long id);
	
	List<User> findAll();

}
