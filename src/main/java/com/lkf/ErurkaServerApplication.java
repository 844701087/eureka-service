package com.lkf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@EnableEurekaServer启动一个Eureka服务注册中心
 *@author: lkf
 *@Date: 2017/7/17 12:01
 */
@EnableEurekaServer
@SpringBootApplication
public class ErurkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErurkaServerApplication.class, args);
	}
}
