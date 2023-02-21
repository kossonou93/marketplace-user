package com.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.entity.User;
import com.marketplace.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/add")
	public String saveUser(@RequestBody User user) {
		userRepository.save(user);
		return "Added User with first_name " + user.getFirst_name();
	}

}
