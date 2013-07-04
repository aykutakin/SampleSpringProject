package com.mydomain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mydomain.dao.UserDao;
import com.mydomain.service.UserService;
import com.mydomain.model.User;

/**
 * 
 * UserService will be supplied from this class.
 * User effected operations will be done via this class
 * 
 * @author aakin
 * 
 */
@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;

	public User findByUsername(final String username) {
		return userDao.findByUsername(username);
	}

}
