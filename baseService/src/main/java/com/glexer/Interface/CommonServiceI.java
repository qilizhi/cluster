package com.glexer.Interface;

import java.io.Serializable;
import java.util.List;

import com.glexer.entities.User;

/**
 * 将经常用到的方法添加到共用方法里
 * 
 * @author qlz
 *
 * @param <T>
 * @param <ID>
 */
public interface CommonServiceI<T, ID extends Serializable> {
	public void add(T entity);

	public void del(T entity);

	public void update(T entity);

	public List<User> list(T entity);

	public T selectByOne(ID id);

	public List<User> listAll();
}
