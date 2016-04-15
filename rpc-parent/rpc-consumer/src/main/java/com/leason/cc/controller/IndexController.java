package com.leason.cc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leason.cc.service.TestRegistryService;
import com.leason.cc.service.UserService;

/**
 * 测试dubbo的rpc远程调用服务
 * @author Leason
 * @email  Leason1989@hotmail.com
 *
 */
@Controller
public class IndexController {
	@Autowired
	private TestRegistryService testRegistryService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/hello",method = { RequestMethod.GET })
	public String hello(
			HttpServletRequest request,
			Map<String, Object> model) {
		String name=testRegistryService.hello("leason");
		model.put("test", name);
		return "index";
	}
	
	@RequestMapping(value = "/regist",method = { RequestMethod.GET })
	public String regist(
			HttpServletRequest request,
			Map<String, Object> model) {
		String name=userService.regist("leason");
		model.put("test", name);
		return "index";
	}
}
