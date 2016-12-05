package com.glexer.core.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.glexer.base.Interface.UserServiceI;
import com.glexer.base.entities.User;
import com.glexer.common.util.Result;
import com.glexer.common.util.ResultCode;
import com.glexer.core.Interface.UserCoreServiceI;

@Service
public class UserCoreServiceImpl implements UserCoreServiceI {

	@Reference
	private UserServiceI userService;

	@Override
	public Result register(User user) {
		// 查询用户是否存在
		if (!userService.exists(user)) {
			// 注册用户
			user = userService.add(user);
			return new Result(user);
		}else{
          return new Result(ResultCode.FAIL,"用户已存在！");
		}
	}

	@Override
	public Result changePassword(Long id, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
