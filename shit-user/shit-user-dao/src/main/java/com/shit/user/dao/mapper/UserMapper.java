package com.shit.user.dao.mapper;

import java.util.List;

import com.shit.user.dao.domain.User;

/**
 * @TODO
 * @author Long
 * @date 2017年8月10日下午5:40:26
 */
public interface UserMapper {

	User selectByPrimaryKey(Long id);
    
    User selectByUsername(String username);
    
    List<User> selectAllUser();
	
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int modifyPassword(User record);
}
