package com.itzyzx.eurekaprovider.controller;

import com.itzyzx.eurekaprovider.bean.User;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


/**
 * @CLassName HelloController
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/6 16:03
 * @Version 1.0
 */
@RestController
public class HelloController {
	private final Logger logger= Logger.getLogger(getClass());
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String index(){
		ServiceInstance instance=client.getLocalServiceInstance();
		logger.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
		return "hello word";
	}

	@RequestMapping(value="/hello01",method=RequestMethod.GET)
	public String hello() throws Exception{
		ServiceInstance instance=client.getLocalServiceInstance();
		//让线程等待几秒钟
		int sleepTime=new Random().nextInt(3000);
		logger.info("sleepTime:"+sleepTime);
		Thread.sleep(sleepTime);

		logger.info("/hello1,host:"+instance.getHost()+",service_id"+instance.getServiceId());
		return "hello word";
	}
	@RequestMapping(value="/hello1",method= RequestMethod.GET)
	public String hello(@RequestParam String name){
		return "hello"+name;
	}

	@RequestMapping(value="/hello2",method=RequestMethod.GET)
	public User hello(@RequestHeader String name,@RequestHeader Integer age){
		return new User(name,age);}

		@RequestMapping(value="/hello3",method=RequestMethod.POST)
	public String hello(@RequestBody User user)
		{
			return "hello"+user.getName()+","+user.getAge();
		}


}
