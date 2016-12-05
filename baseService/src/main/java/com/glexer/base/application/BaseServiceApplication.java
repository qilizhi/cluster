package com.glexer.base.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ImportResource;

import com.glexer.base.annotation.EnableJpaRepositoriesAuto;

@EnableJpaRepositoriesAuto
@EnableCaching(mode = AdviceMode.PROXY)
@ImportResource("classpath:dubbo-customer-provider.xml")
@SpringBootApplication(scanBasePackages="com.glexer.base")
public class BaseServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(BaseServiceApplication.class, args);
	}
}
