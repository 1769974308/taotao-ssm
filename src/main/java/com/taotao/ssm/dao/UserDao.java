package com.taotao.ssm.dao;



import java.util.List;

import com.taotao.ssm.entity.User;

public interface UserDao {
	
	public User getUserById(int id);
	
	public List<User> getUserListByParam(User user);
}
