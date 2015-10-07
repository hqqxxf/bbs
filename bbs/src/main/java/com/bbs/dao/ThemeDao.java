package com.bbs.dao;

import com.bbs.entity.ThemeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ThemeDao extends HibernateDao<ThemeEntity, Integer> {

	public void save(ThemeEntity themeEntity){
		getSession().saveOrUpdate(themeEntity);
	}

	public List<ThemeEntity> list(Integer start, Integer length) {
		return getSession().createQuery("from ThemeEntity order by created_date desc").setFirstResult(start).setMaxResults(length).list();
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
