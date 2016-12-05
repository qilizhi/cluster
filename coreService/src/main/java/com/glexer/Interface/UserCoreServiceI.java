package com.glexer.Interface;

import com.glexer.entities.User;
import com.glexer.util.ResultCode;

/**
 * 用户接口核心服务接口定义
 * 
 * @author qlz
 * @category 用户核心服务
 *
 */
public interface UserCoreServiceI {
	// 用户注册
	public User register(User user);

	// 更改用户密码
	public ResultCode changePassword(Long id, String oldPassword,
			String newPassword);

	// 登录
	public ResultCode login(User user);

	// public List<User> list(User user);

}
