package com.user.serviceinterface;

import java.util.List;

import com.user.model.Login;
import com.user.model.User;

public interface UserInterface {
	public User saveUser(User user);
	
	public List<User> findAllUsers();

	public User getUserById(int id);

	public String login(Login login);
}
