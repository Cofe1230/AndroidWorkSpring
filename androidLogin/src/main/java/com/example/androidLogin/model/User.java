package com.example.androidLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private String userId;
    private String password;
    private String name;
    private String email;
    private String address;
}
