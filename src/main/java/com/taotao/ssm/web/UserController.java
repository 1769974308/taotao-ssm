package com.taotao.ssm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.taotao.ssm.entity.User;
import com.taotao.ssm.service.UserSerivce;
import com.taotao.ssm.util.JsonUtil;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserSerivce userSerivce;
	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String UserList(){
		User user = new User();
		List<User> userList = userSerivce.getUserListByParam(user);
		
		return JsonUtil.toJsonArray(userList);
		
	}
	

}
