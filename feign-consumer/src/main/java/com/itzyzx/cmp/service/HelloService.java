package com.itzyzx.cmp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

}
