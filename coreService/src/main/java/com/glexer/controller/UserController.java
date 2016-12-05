package com.glexer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.glexer.Interface.UserServiceI;
import com.glexer.entities.User;
import com.glexer.util.Result;

@RestController
public class UserController {

	@Reference
	private UserServiceI userInterface;

	/*
	 * @Autowired private CoreUserRespository userResposity;
	 * 
	 * @RequestMapping(value = "/users", method = RequestMethod.GET) public
	 * Result testList() {
	 * 
	 * List<User> users = userResposity.findAll();
	 * 
	 * return new Result(users); }
	 * 
	 * @RequestMapping(value = "/users/add") public Result addUser(User user) {
	 * 
	 * userResposity.save(user); return new Result(ResultCode.SUCCESS); }
	 * 
	 * @RequestMapping("/add") public Result putUser(String name) { User user =
	 * new User(); user.setName(name); userResposity.save(user); return new
	 * Result(ResultCode.SUCCESS); }
	 */
	@RequestMapping("/dubbo")
	public Result testdubbo() {
		List<User> users = new ArrayList<User>();
		try {
			users = userInterface.listAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result(users);
	}
}
