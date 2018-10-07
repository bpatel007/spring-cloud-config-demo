package com.boncloud.springcloudconfig.boncloudspringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BoncloudSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoncloudSpringCloudConfigApplication.class, args);
	}
}
