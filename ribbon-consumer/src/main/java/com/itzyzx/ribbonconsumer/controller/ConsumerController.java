package com.itzyzx.ribbonconsumer.controller;

import com.itzyzx.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @CLassName ConsumerController
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/7 16:22
 * @Version 1.0
 */
@RestController
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	HelloService helloService;
	@RequestMapping(value="/ribbon-consumer",method= RequestMethod.GET)
	public String helloConsumer(){
		//return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
		return helloService.helloService();

	}
}
