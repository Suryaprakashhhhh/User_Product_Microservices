package com.user.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserRepository;
import com.user.model.Login;
import com.user.model.User;
import com.user.serviceinterface.UserInterface;

@Service
public class UserServiceImpl implements UserInterface {

	@Autowired
	private UserRepository userRespsitory;

	@Override
	public User saveUser(User user) {
		return userRespsitory.save(user);
	}

	public List<User> findAllUsers() {
		return userRespsitory.findAll();
	}

	@Override
	public User getUserById(int id) {
		return userRespsitory.findById(id);
	}

	@Override
	public String login(Login login) {
		Optional<User> userObj = userRespsitory.findByEmail(login.getEmail());
		if (userObj.isPresent()) {
			User usero = userObj.get();
			if (login.getEmail().equals(usero.getEmail())) {
				if (login.getPassword().equals(usero.getPassword())) {
					return "Successfully logged in";
				} else {
					return "Password is wrong";
				}
			} else {
				return "Username not exist, Please register it";
			}
		}
		return "Username not exist";
	}

}
