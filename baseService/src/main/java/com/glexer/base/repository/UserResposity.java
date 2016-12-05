package com.glexer.base.repository;

import java.util.List;

import com.glexer.base.entities.User;
import com.glexer.base.repository.base.BaseRepository;

/**
 * Spring data jpa 自动实现的接口
 * 
 * @author qlz
 *
 */
public interface UserResposity extends BaseRepository<User, Long> {

	public List<User> findByEmail(String email);
}
