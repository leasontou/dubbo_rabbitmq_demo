package com.leason.cc.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MQService {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void sendDataToQueue1(Object obj){
		amqpTemplate.convertAndSend("queue_one_key", obj);
	}
}
