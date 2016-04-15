package com.leason.cc.service.impl;

import org.springframework.stereotype.Service;

import com.leason.cc.service.TestRegistryService;



@Service(value="testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService{

	@Override
	public String hello(String name) {
		return "hello:"+name;
	}

}
