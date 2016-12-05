package com.glexer.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.glexer.base.Interface.UserServiceI;
import com.glexer.base.entities.User;
import com.glexer.base.repository.UserResposity;
import com.glexer.base.service.base.BaseServciceImpl;

@Service
@Component
public class UserServiceImpl extends BaseServciceImpl<User, Long> implements
		UserServiceI {
	@Autowired
	private UserResposity userResposity;

	// @Cacheable
	public User add(User user) {
		return userResposity.save(user);
	}

	public void del(User user) {
		userResposity.delete(user);
	}

	public void update(User user) {

		userResposity.saveAndFlush(user);
	}

	public List<User> list(User user) {
		return userResposity.findAll(Example.of(user));
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userResposity.findAll();
	}

	public boolean exists(User user) {
		return userResposity.exists(Example.of(user));
	}

	@Override
	public User selectByOne(Long id) {
		return userResposity.findOne(id);
	}
}
