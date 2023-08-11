package com.example.androidLogin.service;

import org.springframework.stereotype.Service;

import com.example.androidLogin.model.User;
import com.example.androidLogin.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	//가입
	public User userInsert(User user) {
		validateUser(user);
		return userRepository.save(user);
		
	}
	
	//로그인
	public Integer login(User user) {
		User loginUser = userRepository.findByUserId(user.getUserId());
		if(loginUser==null) {
			return 0;
		}else if(!loginUser.getPassword().equals(user.getPassword())) {
			return 0;
		}
		return 1;
	}
	//전체보기
	
	//findbyid
	
	//validate
	public void validateUser(User user) {
		User valiUser = userRepository.findByUserId(user.getUserId());
		if(valiUser!=null) {
			throw new IllegalStateException("이미 가입된 회원입니다.");
		}
		
	}
}
