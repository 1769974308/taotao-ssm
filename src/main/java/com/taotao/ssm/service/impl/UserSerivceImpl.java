package com.taotao.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.ssm.dao.UserDao;
import com.taotao.ssm.entity.User;
import com.taotao.ssm.service.UserSerivce;
@Service
public class UserSerivceImpl implements UserSerivce{
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserById(int id) {
		
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getUserListByParam(User user) {
		
		return userDao.getUserListByParam(user);
	}

}
