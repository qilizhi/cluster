package com.glexer.repository;

import java.util.List;

import com.glexer.entities.User;
import com.glexer.repository.base.BaseRepository;

/**
 * Spring data jpa 自动实现的接口
 * 
 * @author qlz
 *
 */
public interface UserResposity extends BaseRepository<User, Long> {

	public List<User> findByEmail(String email);
}
