package com.bbs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bbs.entity.PostEntity;

@Repository
public class PostDao extends HibernateDao<PostEntity, Integer> {

	public PostEntity get(Integer id) {
		return (PostEntity) getSession().get(PostEntity.class, id);
	}

	public List<PostEntity> getByThemeId(Integer id, Integer start, Integer length) {
		return getSession().createQuery("from PostEntity where tid = " + id + " order by created_date desc")
				.setFirstResult(start).setMaxResults(length).list();
	}

}
