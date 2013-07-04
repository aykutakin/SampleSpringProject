package com.mydomain.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mydomain.model.Role;
import com.mydomain.model.User;


/**
 * 
 * User database operations will be supplied from this class
 * 
 * @author aakin
 * 
 */
@Repository
public class UserDao {

	public User findByUsername(final String username) {
		User user = new User();
		user.setFirstName("firstName");
		user.setLastName("lastName");
		user.setUsername("user");
		user.setPassword("1111");
		Role r = new Role();
		r.setName("ROLE_USER");
		List<Role> roles = new ArrayList<Role>();
		roles.add(r);
		user.setAuthorities(roles);
		return user;
	}

}
