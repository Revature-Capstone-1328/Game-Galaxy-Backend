package com.revature.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

@Service
public class UserService {
	
	private UserDAO userDAO;
	
	@Autowired
	public UserService(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}
	
	public boolean register(User user) {
		if(user!=null) {
			user.setId(0);
			userDAO.save(user);
			return true;
		}
		return false;
	}
	
	public User login(User user) {
		Optional<User> dbUser = userDAO.getUserbyUsername(user.getUsername());
		if(dbUser.isPresent()) {
			if(dbUser.get().getPassword().equals(user.getPassword())) {
				return dbUser.get();
			}
		}
		return null;
	}
	
	public User update(User user) {
		Optional<User> dbUser = userDAO.getUserbyUsername(user.getUsername());
		if(dbUser.isPresent()) {
			userDAO.save(user);
			return user;
		}
		return null;
	}
}
