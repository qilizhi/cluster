package com.glexer.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.glexer.base.Interface.UserServiceI;
import com.glexer.base.entities.User;
import com.glexer.common.util.Result;

/**
 * 测试用例
 * @author qlz 戚里志 814597004@qq.com
 * 2016年8月22日 - 下午5:40:26
 */
@RestController
public class UserCoreController {

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
