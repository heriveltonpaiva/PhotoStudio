package br.unirn.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T> {
	public void insert(Object entity);

	public void update(T entity);

	public T findById(Serializable id);

	public List<T> findAll();

	public void delete(T entity);

}