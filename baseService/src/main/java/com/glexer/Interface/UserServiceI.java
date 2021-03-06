package com.glexer.Interface;

import org.springframework.data.repository.NoRepositoryBean;

import com.glexer.entities.User;

/**
 * @author qlz
 * 
 * 提供自定义简化接口 主要是为了不用暴露太多没用的接口,当然也不必一定要继承 UserResposity,也可以只继承CommonServiceI
 * ,但要在实现方法xxxServcieImpl中提供实现。
 * 
 * 
 *
 */
@NoRepositoryBean
public interface UserServiceI extends CommonServiceI<User, Long> {

}
