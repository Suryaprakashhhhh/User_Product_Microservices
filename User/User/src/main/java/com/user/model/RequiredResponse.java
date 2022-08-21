package com.user.model;

import java.util.List;

public class RequiredResponse {
	private User user;

	public RequiredResponse() {
		super();
	}

	public RequiredResponse(User user) {
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
