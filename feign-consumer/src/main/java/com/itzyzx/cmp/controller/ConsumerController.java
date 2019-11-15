package com.itzyzx.cmp.controller;

import com.itzyzx.cmp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName ConsumerController
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/15 14:18
 * @Version 1.0
 */
//实现对Feign客户端的调用
@RestController
public class ConsumerController {
	@Autowired
	HelloService helloService;

	@RequestMapping(value="/feign-consumer",method= RequestMethod.GET)
	public String helloConsumer(){
		return helloService.hello();
	}
}
