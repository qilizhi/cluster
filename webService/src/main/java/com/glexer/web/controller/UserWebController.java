package com.glexer.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.glexer.common.util.Result;
import com.glexer.core.Interface.UserCoreServiceI;

@RequestMapping("/web")
@Controller
public class UserWebController {

	@Reference
	private UserCoreServiceI userCoreService;

	@RequestMapping("/users")
	@ResponseBody
	public Result listUser() {

		return new Result();
	}
	
	@RequestMapping("/index")
	public String testJsp(){
		return "main";
		
	}
}
