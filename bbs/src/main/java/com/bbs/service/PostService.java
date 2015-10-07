package com.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbs.dao.PostDao;
import com.bbs.entity.PostEntity;

@Service
@Transactional
public class PostService {

	@Autowired
	private PostDao postDao;

	public PostEntity getPostById(Integer id) {
		return postDao.get(id);
	}

	public List<PostEntity> getPostListByThemeId(Integer id, Integer start, Integer length) {
		return postDao.getByThemeId(id, start, length);
	}

	public void postToTheme(PostEntity postEntity){
		postDao.postToTheme(postEntity);
	}

	public Long getPostNum(Integer themeId){
		return postDao.postNums(themeId);
	}

}
