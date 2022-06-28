package com.revature.services;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserDAO userDAO;

	@Autowired
	private UserService userService;

	User user;
	
	@BeforeEach
	void initUser() {
		user = new User();
		user.setUsername("Puru");
		user.setPassword("Hello");
		user.seteMail("a@b.com");
	}
	@Test
	void registerAndloginUser() {
		assertEquals(true, userService.register(user));
		User loggedinuser = userService.login(user);
		assertEquals("Puru", loggedinuser.getUsername());
	}
	@Test
	void updateUser() {
		// initUser();
		user.seteMail("x@y.com");
		userService.update(user);
		Optional<User> updatedUser = userDAO.getUserByUsername("Puru");
		assertEquals("x@y.com", updatedUser.get().geteMail());
	}
}


