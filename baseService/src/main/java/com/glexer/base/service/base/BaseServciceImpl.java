package com.glexer.base.service.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.glexer.base.repository.base.BaseRepository;

public abstract class BaseServciceImpl<T, ID extends Serializable> {

	@Autowired
	protected BaseRepository<T, ID> baseRepository;

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return baseRepository.findAll();
	}

	public List<T> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(sort);
	}

	public List<T> findAll(Iterable<ID> ids) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(ids);
	}

	public <S extends T> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return baseRepository.save(entities);
	}

	public void flush() {
		baseRepository.flush();

	}

	public <S extends T> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return baseRepository.saveAndFlush(entity);
	}

	public void deleteInBatch(Iterable<T> entities) {
		// TODO Auto-generated method stub
		baseRepository.deleteInBatch(entities);

	}

	public void deleteAllInBatch() {
		baseRepository.deleteAllInBatch();

	}

	public T getOne(ID id) {
		// TODO Auto-generated method stub
		return baseRepository.getOne(id);
	}

	public <S extends T> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(example);
	}

	public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(example, sort);
	}

	public Page<T> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(pageable);
	}

	public <S extends T> S save(S entity) {
		// TODO Auto-generated method stub
		return baseRepository.save(entity);
	}

	public T findOne(ID id) {
		// TODO Auto-generated method stub
		return baseRepository.findOne(id);
	}

	public boolean exists(ID id) {
		// TODO Auto-generated method stub
		return baseRepository.exists(id);
	}

	public long count() {
		// TODO Auto-generated method stub
		return baseRepository.count();
	}

	public void delete(ID id) {
		// TODO Auto-generated method stub
		baseRepository.delete(id);
	}

	public void delete(T entity) {
		// TODO Auto-generated method stub
		baseRepository.delete(entity);
	}

	public void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		baseRepository.delete(entities);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		baseRepository.deleteAll();

	}

	public <S extends T> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return baseRepository.findOne(example);
	}

	public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(example, pageable);
	}

	public <S extends T> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return baseRepository.count(example);
	}

	public <S extends T> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return baseRepository.exists(example);
	}

	public <S extends T> boolean exists(S s) {
		return baseRepository.exists(Example.of(s));
	}

	public T findOne(Specification<T> spec) {
		// TODO Auto-generated method stub
		return baseRepository.findOne(spec);
	}

	public List<T> findAll(Specification<T> spec) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(spec);
	}

	public Page<T> findAll(Specification<T> spec, Pageable pageable) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(spec, pageable);
	}

	public List<T> findAll(Specification<T> spec, Sort sort) {
		// TODO Auto-generated method stub
		return baseRepository.findAll(spec, sort);
	}

	public long count(Specification<T> spec) {
		// TODO Auto-generated method stub
		return baseRepository.count(spec);
	}

	public <S extends T> S merge(S entity) {
		// TODO Auto-generated method stub
		return baseRepository.merge(entity);
	}

	public <S extends T> S saveOrUpdate(S entity) {
		// TODO Auto-generated method stub
		return baseRepository.saveOrUpdate(entity);
	}

}