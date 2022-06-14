package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
