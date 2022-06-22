package com.revature.services;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;


import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

@SpringBootTest
public class UserServiceTest {
//
//    private static UserService userService;
//    private static UserDAO userDAO;
//
//    private User USER_TEST;
//    private User USER_TO_REGISTER;
//
//    @BeforeAll
//    public static void setUpBeforeClass() throws Exception {
//    	userDAO = mock(UserDAO.class);
//        userService = new UserService(userDAO);
//        //userService.userDAO=userDAO;
//    }
//
//    @BeforeEach
//    public void setUp() throws Exception {
//        USER_TEST = new User("genericEmployee1", "genericPassword", "genericEmail");
//        USER_TO_REGISTER = new User("genericEmployee1", "genericPassword", "genericEmail");
//	
//    }
//
//    @Test
//    public void testGetByUsernamePassesWhenUsernameExists() {
//        when(userDAO.getUserByUsername(anyString())).thenReturn(Optional.of(USER_TEST));
//        when(userDAO.save(any())).thenReturn(USER_TEST);
//        assertEquals(USER_TEST, userService.getUserByUsername(USER_TEST.getUsername()));
//        verify(userDAO).save(USER_TEST);
//        verify(userDAO).getUserByUsername(USER_TEST.getUsername());
//    }
//    
//
//	@Test
//	public void testRegisterSuccessful() {
//		when(userDAO.getUserByUsername(anyString())).thenReturn(Optional.of(USER_TEST));
//		
//		assertEquals(true,userService.register(USER_TEST));
//
//		verify(userDAO).getUserByUsername(USER_TO_REGISTER.getUsername());
//	}
//
//	@Test
//	public void testRegisterPassesWhenUsernameIsNotTaken() {
//		when(userDAO.getUserByUsername(anyString())).thenReturn(null);
//		when(userDAO.save(any())).thenReturn(USER_TO_REGISTER);
//		
//		assertEquals(true, userService.register(USER_TO_REGISTER));
//
//		verify(userDAO).getUserByUsername(USER_TO_REGISTER.getUsername());
//		verify(userDAO).save(USER_TO_REGISTER);
//		
//	}
//
//
//
//	@Test
//	public void testLoginPassesWhenUsernameDoesExistAndPasswordMatches() {
//		when(userDAO.getUserByUsername(anyString())).thenReturn(Optional.of(USER_TEST));
//
//		assertEquals(USER_TEST, userService.login(USER_TEST));
//
//		verify(userDAO).getUserByUsername(USER_TEST.getUsername());
//	}
}

