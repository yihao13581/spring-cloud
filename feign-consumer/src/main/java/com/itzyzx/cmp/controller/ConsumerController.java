package com.itzyzx.cmp.controller;

import com.itzyzx.cmp.bean.User;
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

	@RequestMapping(value="/feign-consumer2",method=RequestMethod.GET)
	public String helloConsumer2(){
		StringBuilder sb=new StringBuilder();
		sb.append(helloService.hello()).append("\n");
		sb.append(helloService.hello("DIDI")).append("\n");
		sb.append(helloService.hello("DIDI",30)).append("\n");
		sb.append(helloService.hello(new User("DIDI",30))).append("\n");
		sb.append(helloService.hello()).append("\n");
		return sb.toString();
	}
}

