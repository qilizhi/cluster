package com.glexer.base.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy.Key;

import com.glexer.base.repository.base.BaseRepositoryFactoryBean;
import com.glexer.base.repository.base.BaseRepositoryImpl;

/**
 * 自动配置自定义的jpa repositories
 * 
 * @author qlz
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EntityScan(basePackages = "com.glexer.base.entities")
@EnableJpaRepositories(basePackages = "com.glexer.base.repository", queryLookupStrategy = Key.CREATE_IF_NOT_FOUND, repositoryBaseClass = BaseRepositoryImpl.class, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class, repositoryImplementationPostfix = "Impl")
public @interface EnableJpaRepositoriesAuto {
	/**
	 * 默认值
	 */
	String value() default "";
}
