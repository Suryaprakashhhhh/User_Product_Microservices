package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.dto.UserDto;
import com.user.model.Login;
import com.user.model.User;
import com.user.serviceimplementation.UserServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "register")
	public User saveUser(@RequestBody UserDto userDto) {
		return userServiceImpl.saveUser(userDto.getUser());
	}

	@GetMapping(value = "list")
	public List<User> findAllUsers() {
		return userServiceImpl.findAllUsers();
	}

	@GetMapping(value = "login")
	public String loginUser(@RequestBody Login login) {
		String loginObj = userServiceImpl.login(login);
		return loginObj;
	}

	@GetMapping(value = "getUser/{id}")
	public User findUserById(@PathVariable int id) {
		return userServiceImpl.getUserById(id);
	}

}

