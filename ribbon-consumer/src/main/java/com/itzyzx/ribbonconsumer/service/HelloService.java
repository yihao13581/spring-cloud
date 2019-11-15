package com.itzyzx.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @CLassName HelloService
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/14 14:31
 * @Version 1.0
 */
@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "helloFallback")
	public String helloService(){
		return restTemplate.getForEntity("http://HELLO_SERVICE/hello",String.class).getBody();

	}
	public String helloFallback(){
		return "error";
	}
}
