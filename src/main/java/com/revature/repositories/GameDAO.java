package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Game;

public interface GameDAO extends JpaRepository<Game, Integer>{

}
