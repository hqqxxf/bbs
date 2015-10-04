package com.bbs.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.bbs.utils.ReflectionUtils;


public class HibernateDao<T, PK extends Serializable> {

	protected SessionFactory sessionFactory;
	protected Class<T> entityClass;

	public HibernateDao() {
		this.entityClass = ReflectionUtils.getSuperClassGenricType(getClass());
	}
	
	public void initEntity(T entity) {
		Hibernate.initialize(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T findUnique(final Criterion... criterions) {
		return (T) createCriteria(criterions).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public T findUnique(final String hql, final Object... values) {
		return (T) createQuery(hql, values).uniqueResult();
	}
	
	public Query createQuery(final String queryString,
			final Map<String, Object> values) {
		Query query = getSession().createQuery(queryString);
		if (values != null) {
			query.setProperties(values);
		}
		return query;
	}
	
	public Query createQuery(final String queryString, final Object... values) {
		Query query = getSession().createQuery(queryString);
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				query.setParameter(i, values[i]);
			}
		}
		return query;
	}
	
	@SuppressWarnings("unchecked")
	public T findUniqueBy(final String propertyName, final Object value) {
		Criterion criterion = Restrictions.eq(propertyName, value);
		return (T) createCriteria(criterion).uniqueResult();
	}
	
	public List<T> findBy(final String propertyName, final Object value) {
		Criterion criterion = Restrictions.eq(propertyName, value);
		return find(criterion);
	}
	
	public List<T> getAll(){
		return find();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> find(Criterion... criterion){
		return createCriteria(criterion).list();
	}
	
	public Criteria createCriteria(final Criterion... criterions){
		Criteria criteria = getSession().createCriteria(entityClass);
		for (Criterion c : criterions) {
			criteria.add(c);
		}
		return criteria; 
	}
	
	public void delete(final PK id){
		getSession().delete(get(id));
	}
	
	@SuppressWarnings("unchecked")
	public T get(final PK id){
		return (T) getSession().get(entityClass, id);
	}
	
	public void save(final T entity){
		getSession().saveOrUpdate(entity);
	}
	
	public Session getSession(){
		return sessionFactory.openSession();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

}
