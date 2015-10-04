package com.bbs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bbs.entity.ThemeEntity;

@Repository
@Transactional
public class ThemeDao extends HibernateDao<ThemeEntity, Integer> {

	public void add(ThemeEntity themeEntity){
		getSession().saveOrUpdate(themeEntity);
	}

	public List<ThemeEntity> list(Integer start, Integer length) {
		return getSession().createQuery("from ThemeEntity").setFirstResult(start).setMaxResults(length).list();
	}

	public void delete(ThemeEntity themeEntity){
		getSession().delete(themeEntity);
	}

	public void delete(Integer id){
		getSession().delete(get(id));
	}

	public ThemeEntity get(Integer id){
		return (ThemeEntity) getSession().get(ThemeEntity.class, id);
	}

}
