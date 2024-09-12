package com.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);

}
