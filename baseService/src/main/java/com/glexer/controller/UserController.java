package com.glexer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.glexer.entities.User;
import com.glexer.repository.UserResposity;
import com.glexer.service.UserServiceImpl;
import com.glexer.util.Result;
import com.glexer.util.ResultCode;

@RestController
public class UserController {
	//@Reference(version = "userService")
	@Autowired
	private UserServiceImpl userService;

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
