package com.user.dto;

import com.user.model.User;

public class UserDto {
	private User user;

	public UserDto() {
		super();
	}

	public UserDto(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
