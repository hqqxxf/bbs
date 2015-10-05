package com.bbs.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bbs.entity.UserEntity;

@Repository
public class UserDao extends HibernateDao<UserEntity, Integer> {
	public UserEntity getUserByPassword(String username, String password){
		return (UserEntity) getSession().createQuery("from UserEntity where username = '" + username + "' and password = '" + password + "'").uniqueResult();
	}
}
