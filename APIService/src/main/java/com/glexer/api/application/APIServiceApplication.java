package com.glexer.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ImportResource;

@EnableCaching(mode = AdviceMode.PROXY)
@ImportResource("classpath:dubbo-consumer-provider.xml")
@SpringBootApplication(scanBasePackages="com.glexer.api")
public class APIServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(APIServiceApplication.class, args);
	}
}
