package com.leason.cc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leason.cc.service.impl.MQService;

@Controller
public class IndexController {
	@Autowired
	private MQService mqService;
	
	@RequestMapping(value = "/index",method = { RequestMethod.GET })
	public String homePage(
			HttpServletRequest request,
			Map<String, Object> model) {
		model.put("test", "测试啊");
		return "index";
	}
	
	/**
	 * mq example
	 */
	@RequestMapping(value = "/mq/{message}",method={RequestMethod.GET})
	@ResponseBody
	public String mqTest(@PathVariable(value="message")String obj){
		mqService.sendDataToQueue1(obj);
		return "success";
	}
}
