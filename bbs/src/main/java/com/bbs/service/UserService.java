package com.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbs.dao.UserDao;
import com.bbs.entity.UserEntity;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public UserEntity getUser(String username, String password){
		return userDao.getUserByPassword(username, password);
	}
	
}
