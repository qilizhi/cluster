package com.glexer.core.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ImportResource;

@EnableCaching(mode = AdviceMode.PROXY)
@ImportResource(locations = { "classpath:dubbo-consumer-provider.xml"})
@SpringBootApplication(scanBasePackages="com.glexer.core")
public class CoreServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CoreServiceApplication.class, args);
	}
}
