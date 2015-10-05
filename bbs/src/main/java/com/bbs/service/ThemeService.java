package com.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbs.dao.ThemeDao;
import com.bbs.entity.ThemeEntity;

@Service
@Transactional
public class ThemeService {

	@Autowired
	private ThemeDao themeDao;
	
	public List<ThemeEntity> getThemeList(Integer start, Integer length){
		return themeDao.list(start, length);
	}
	
	public ThemeEntity getByThemeId(Integer id){
		return themeDao.get(id);
	}
	
}
