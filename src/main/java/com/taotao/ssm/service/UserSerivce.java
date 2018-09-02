package com.taotao.ssm.service;

import java.util.List;

import com.taotao.ssm.entity.User;

public interface UserSerivce {
	
	public User getUserById(int id);
	
	public List<User> getUserListByParam(User user);
}
