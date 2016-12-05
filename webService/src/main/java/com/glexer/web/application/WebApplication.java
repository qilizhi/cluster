package com.glexer.web.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ImportResource;

@EnableCaching(mode = AdviceMode.PROXY)
@ImportResource("classpath:dubbo-consumer-provider.xml")
@SpringBootApplication(scanBasePackages="com.glexer.web")
public class WebApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebApplication.class, args);
	}
}
