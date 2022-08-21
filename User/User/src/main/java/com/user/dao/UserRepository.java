package com.user.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findById(int id);

	Optional<User> findByEmail(String email);

}