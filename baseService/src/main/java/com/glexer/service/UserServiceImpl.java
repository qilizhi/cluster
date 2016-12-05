package com.glexer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.glexer.Interface.UserServiceI;
import com.glexer.entities.User;
import com.glexer.repository.UserResposity;

//@Component
// @CacheConfig(cacheNames = "user")
//@Transactional
@Service
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserResposity userResposity;

	// @Cacheable
	public void add(User user) {
		userResposity.save(user);
	}

	public void del(User user) {
		userResposity.delete(user);
	}

	public void update(User user) {

		userResposity.saveAndFlush(user);
	}

	public List<User> list(User user) {
		return userResposity.findAll(Example.of(user));
	}

	@Override
	public List<User> listAll() {
		// TODO Auto-generated method stub
		return userResposity.findAll();
	}

	/*
	 * @Override public <S extends User> S merge(S entity) { // TODO
	 * Auto-generated method stub return userResposity.merge(entity); }
	 * 
	 * @Override public <S extends User> S saveOrUpdate(S entity) { // TODO
	 * Auto-generated method stub return userResposity.saveOrUpdate(entity); }
	 * 
	 * @Override public List<User> findAll() { // TODO Auto-generated method
	 * stub return userResposity.findAll(); }
	 * 
	 * @Override public List<User> findAll(Sort sort) { // TODO Auto-generated
	 * method stub return userResposity.findAll(sort); }
	 * 
	 * @Override public List<User> findAll(Iterable<Long> ids) { // TODO
	 * Auto-generated method stub return userResposity.findAll(ids); }
	 * 
	 * @Override public <S extends User> List<S> save(Iterable<S> entities) { //
	 * TODO Auto-generated method stub return userResposity.save(entities); }
	 * 
	 * @Override public void flush() { userResposity.flush();
	 * 
	 * }
	 * 
	 * @Override public <S extends User> S saveAndFlush(S entity) { // TODO
	 * Auto-generated method stub return userResposity.saveAndFlush(entity); }
	 * 
	 * @Override public void deleteInBatch(Iterable<User> entities) { // TODO
	 * Auto-generated method stub userResposity.deleteAllInBatch();
	 * 
	 * }
	 * 
	 * @Override public void deleteAllInBatch() { // TODO Auto-generated method
	 * stub userResposity.deleteAllInBatch(); }
	 * 
	 * @Override public User getOne(Long id) { // TODO Auto-generated method
	 * stub return userResposity.getOne(id); }
	 * 
	 * @Override public <S extends User> List<S> findAll(Example<S> example) {
	 * // TODO Auto-generated method stub return userResposity.findAll(example);
	 * }
	 * 
	 * @Override public <S extends User> List<S> findAll(Example<S> example,
	 * Sort sort) { // TODO Auto-generated method stub return
	 * userResposity.findAll(example, sort); }
	 * 
	 * @Override public Page<User> findAll(Pageable pageable) { // TODO
	 * Auto-generated method stub return userResposity.findAll(pageable); }
	 * 
	 * @Override public <S extends User> S save(S entity) { // TODO
	 * Auto-generated method stub return userResposity.save(entity); }
	 * 
	 * @Override public User findOne(Long id) { // TODO Auto-generated method
	 * stub return userResposity.findOne(id); }
	 * 
	 * @Override public boolean exists(Long id) { // TODO Auto-generated method
	 * stub return userResposity.exists(id); }
	 * 
	 * @Override public long count() { // TODO Auto-generated method stub return
	 * userResposity.count(); }
	 * 
	 * @Override public void delete(Long id) { // TODO Auto-generated method
	 * stub userResposity.delete(id);
	 * 
	 * }
	 * 
	 * @Override public void delete(User entity) { // TODO Auto-generated method
	 * stub userResposity.delete(entity);
	 * 
	 * }
	 * 
	 * @Override public void delete(Iterable<? extends User> entities) { // TODO
	 * Auto-generated method stub userResposity.delete(entities);
	 * 
	 * }
	 * 
	 * @Override public void deleteAll() { // TODO Auto-generated method stub
	 * userResposity.deleteAll();
	 * 
	 * }
	 * 
	 * @Override public <S extends User> S findOne(Example<S> example) { // TODO
	 * Auto-generated method stub return userResposity.findOne(example); }
	 * 
	 * @Override public <S extends User> Page<S> findAll(Example<S> example,
	 * Pageable pageable) { // TODO Auto-generated method stub return
	 * userResposity.findAll(example, pageable); }
	 * 
	 * @Override public <S extends User> long count(Example<S> example) { //
	 * TODO Auto-generated method stub return userResposity.count(example); }
	 * 
	 * @Override public <S extends User> boolean exists(Example<S> example) { //
	 * TODO Auto-generated method stub return userResposity.exists(example); }
	 * 
	 * @Override public User findOne(Specification<User> spec) { // TODO
	 * Auto-generated method stub return userResposity.findOne(spec); }
	 * 
	 * @Override public List<User> findAll(Specification<User> spec) { // TODO
	 * Auto-generated method stub return userResposity.findAll(spec); }
	 * 
	 * @Override public Page<User> findAll(Specification<User> spec, Pageable
	 * pageable) { // TODO Auto-generated method stub return
	 * userResposity.findAll(spec, pageable); }
	 * 
	 * @Override public List<User> findAll(Specification<User> spec, Sort sort)
	 * { // TODO Auto-generated method stub return userResposity.findAll(spec,
	 * sort); }
	 * 
	 * @Override public long count(Specification<User> spec) { // TODO
	 * Auto-generated method stub return userResposity.count(spec); }
	 */

	@Override
	public User selectByOne(Long id) {
		return userResposity.findOne(id);
	}
}
