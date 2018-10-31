package com.helpdesk.com.service;

import org.springframework.data.domain.Page;

import com.helpdesk.com.entity.User;

public interface UserService {
	
	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete(User user);

	Page<User> findAll(int page, int count);
}
