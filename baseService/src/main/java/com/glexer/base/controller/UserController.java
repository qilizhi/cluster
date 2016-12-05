package com.glexer.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.glexer.base.Interface.UserServiceI;
import com.glexer.base.entities.User;
import com.glexer.base.repository.UserResposity;
import com.glexer.common.util.Result;
import com.glexer.common.util.ResultCode;

/**
 * 测试用例
 * @author qlz
 *
 */
@RestController
public class UserController {
	@Reference
	private UserServiceI userService;

	//@Autowired
	//private UserServiceImpl userServiceImpl;
	@Autowired
	private UserResposity userResposity;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Result testList() {

		List<User> users = userResposity.findAll();

		return new Result(users);
	}

	@RequestMapping(value = "/users/add")
	public Result addUser(User user) {

		userResposity.save(user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping("/add")
	public Result putUser(String name) {
		User user = new User();
		user.setName(name);
		userResposity.save(user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping("/dubbo")
	public Result testdubbo() {

		return new Result(userService.listAll());
	}
}
