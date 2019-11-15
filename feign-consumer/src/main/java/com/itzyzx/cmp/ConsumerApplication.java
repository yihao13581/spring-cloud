package com.itzyzx.cmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @CLassName ConsumerApplication
 * @Description: TODO
 * @Author: shenhao
 * @date: 2019/11/15 14:06
 * @Version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class,args);
	}
}
