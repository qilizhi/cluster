package com.glexer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.glexer.annotation.EnableJpaRepositoriesAuto;

@EnableAutoConfiguration
@Configuration
@ComponentScan("com.glexer")
// @EnableJpaRepositories(basePackages = "com.glexer.repository",
// queryLookupStrategy = Key.CREATE_IF_NOT_FOUND, repositoryBaseClass =
// BaseRepositoryImpl.class, repositoryFactoryBeanClass =
// BaseRepositoryFactoryBean.class, repositoryImplementationPostfix = "Impl")
@EnableJpaRepositoriesAuto
@EntityScan("com.glexer.entities")
@EnableCaching(mode = AdviceMode.PROXY)
@ImportResource("classpath:dubbo-provider.xml")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
