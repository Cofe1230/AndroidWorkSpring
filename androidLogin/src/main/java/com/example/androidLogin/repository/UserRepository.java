package com.example.androidLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.androidLogin.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserId(String userId);
}
