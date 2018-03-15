package com.hanma56.cloud.route;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@MapperScan(value = {"com.hanma56.cloud.route.dao"})
@EnableFeignClients
public class SpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}
