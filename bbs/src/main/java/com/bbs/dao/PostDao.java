package com.bbs.dao;

import com.bbs.entity.PostEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostDao extends HibernateDao<PostEntity, Integer> {

	public PostEntity get(Integer id) {
		return (PostEntity) getSession().get(PostEntity.class, id);
	}

	public List<PostEntity> getByThemeId(Integer id, Integer start, Integer length) {
		return getSession().createQuery("from PostEntity where tid = " + id + " order by created_date desc")
				.setFirstResult(start).setMaxResults(length).list();
	}

	public void postToTheme(PostEntity postEntity){
		getSession().save(postEntity);
	}

	public Long postNums(Integer tid){
		return (Long) getSession().createQuery("select count(*) from PostEntity where tid = " + tid).uniqueResult();
	}

}
