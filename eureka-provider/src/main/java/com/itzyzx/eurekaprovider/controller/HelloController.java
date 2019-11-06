package com.itzyzx.eurekaprovider.controller;




import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




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
}
