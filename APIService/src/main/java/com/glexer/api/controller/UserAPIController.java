package com.glexer.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.glexer.base.Interface.UserServiceI;
import com.glexer.base.entities.User;
import com.glexer.common.util.Result;
import com.glexer.common.util.ResultCode;
import com.glexer.core.Interface.UserCoreServiceI;

@RestController
public class UserAPIController {

	@Reference
	private UserServiceI userService;
	@Reference
	private UserCoreServiceI userCoreService;
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public Result add(User user){
		user=userService.add(user);
		return new Result(ResultCode.SUCCESS,user);
	}
	@RequestMapping(value="/user/register")
	public Result register(User user){
		return userCoreService.register(user);
	}
	@RequestMapping(value="/users")
	public Result listAll(){
		List<User> users=userService.findAll();
		return new Result(users);
	}
}
