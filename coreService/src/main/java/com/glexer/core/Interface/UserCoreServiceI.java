package com.glexer.core.Interface;

import com.glexer.base.entities.User;
import com.glexer.common.util.Result;

/**
 * 用户接口核心服务接口定义
 * 
 * @author qlz
 * @category 用户核心服务
 *
 */
public interface UserCoreServiceI {
	// 用户注册
	public Result register(User user);

	// 更改用户密码
	public Result changePassword(Long id, String oldPassword,
			String newPassword);

	// 登录
	public Result login(User user);

	// public List<User> list(User user);

}
