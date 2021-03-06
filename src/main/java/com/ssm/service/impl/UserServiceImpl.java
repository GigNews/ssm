package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;
	
	@Override
	public int insert(User user) {
		return usermapper.insert(user);
	}

	@Override
	public User getUser(int id) {
		return usermapper.selectByPrimaryKey(id);
	}
}