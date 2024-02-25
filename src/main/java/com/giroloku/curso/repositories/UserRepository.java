package com.giroloku.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.giroloku.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
