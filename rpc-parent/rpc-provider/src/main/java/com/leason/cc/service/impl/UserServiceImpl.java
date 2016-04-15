package com.leason.cc.service.impl;

import org.springframework.stereotype.Service;

import com.leason.cc.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Override
	public String regist(String name) {
		return "regist:"+name;
	}

}
