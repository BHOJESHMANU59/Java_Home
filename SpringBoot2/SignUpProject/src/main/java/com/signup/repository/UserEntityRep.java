package com.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.signup.entity.User;
public interface UserEntityRep extends JpaRepository<User, Integer>
{
	public User findByEmail(String email);
	
	@Query("select u.pwd from User u where u.email=?1")
	public String findPwdByEmail(String email);

	public User findByName(String name);

}
