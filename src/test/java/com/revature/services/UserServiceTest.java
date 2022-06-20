package com.revature.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

@SpringBootTest
public class UserServiceTest {

    private static UserService userService;
    private static UserDAO userDAO;

    private User USER_TEST;
    private User USER_TO_REGISTER;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        userService = new UserService(userDAO);
        userDAO = mock(UserDAO.class);
        userService.userDAO=userDAO;
    }

    @Before
    public void setUp() throws Exception {
        USER_TEST = new User(0,"genericEmployee1", "genericPassword", "genericEmail");
        USER_TO_REGISTER = new User(0,"genericEmployee2", "genericPassword", "genericEmail");

    }
    
    @Test
    public void testGetByUsernamePassesWhenUsernameExists() {
        when(userDAO.getUserByUsername(anyString())).thenReturn(Optional.of(USER_TEST));

        assertEquals(Optional.of(USER_TEST), userService.getUserByUsername(USER_TEST.getUsername()));

        verify(userDAO).getUserByUsername(USER_TEST.getUsername());
    }


    @Test
    public void testRegisterFailsWhenUsernameIsTaken() {
        when(userService.getUserByUsername(anyString())).thenReturn(USER_TEST);

        assertEquals(null,userService.register(USER_TEST));

        verify(userService).getUserByUsername(USER_TO_REGISTER.getUsername());
        verify(userDAO, never()).save(USER_TO_REGISTER);
    }

    @Test
    public void testRegisterPassesWhenUsernameIsNotTaken() {
        //when(userService.getUserByUsername(anyString())).thenReturn(null);
        when(userDAO.save(anyObject())).thenReturn(USER_TEST);

        assertEquals(USER_TEST, userService.register(USER_TO_REGISTER));

        verify(userService).getUserByUsername(USER_TO_REGISTER.getUsername());
        verify(userDAO).save(USER_TO_REGISTER);
    }



    @Test
    public void testLoginPassesWhenUsernameDoesExistAndPasswordMatches() {
        when(userService.getUserByUsername(anyString())).thenReturn(USER_TEST);

        assertEquals(USER_TEST, userService.login(USER_TEST));

        verify(userService).getUserByUsername(USER_TO_REGISTER.getUsername());
    }
}
