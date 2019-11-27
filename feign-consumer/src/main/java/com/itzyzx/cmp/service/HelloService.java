package com.itzyzx.cmp.service;

import com.itzyzx.cmp.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @CLassName HelloService
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/15 14:15
 * @Version 1.0
 */
//这里的服务名不区分大小写
@FeignClient("hello-service")
public interface HelloService {
	@RequestMapping("/hello")
	String hello();
	@RequestMapping(value="/hello1",method=RequestMethod.GET)
	String hello(@RequestParam("name")String name);

	@RequestMapping(value="/hello2",method=RequestMethod.GET)
	User hello(@RequestHeader("name")String name,@RequestHeader("age")Integer age);

	@RequestMapping(value="/hello3",method=RequestMethod.POST)
	String hello(@RequestBody User user);

}
