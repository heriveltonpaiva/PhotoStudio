package br.unirn.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public  class GenericDaoImpl<T> implements GenericDao<T> {
	
    private EntityManagerFactory factory  = Persistence.createEntityManagerFactory("PhotoJPAPU");
	
	protected EntityManager em = factory.createEntityManager();
	
	public EntityManager getEntityManager() {
		return em;
	}
	
	
	@Override
	public void insert(Object entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();	
		em.close();
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		
		return null;
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

}