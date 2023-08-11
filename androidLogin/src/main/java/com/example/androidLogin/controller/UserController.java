package com.example.androidLogin.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.androidLogin.model.User;
import com.example.androidLogin.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	@PutMapping("/join")
	public User join(@RequestBody User user) {
		try {
			return userService.userInsert(user);
			
		}catch (IllegalStateException e) {
			return null;
		}
	}
	@PostMapping("/login")
	public Integer login(@RequestBody User user) {
		int flag = userService.login(user);
		
		return flag;

	}
}
