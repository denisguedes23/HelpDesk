package com.helpdesk.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.helpdesk.com.entity.User;
import com.helpdesk.com.repository.UserRepository;
import com.helpdesk.com.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRpository;

	@Override
	public User findByEmail(String email) {
		return this.userRpository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRpository.save(user);
	}

	@Override
	public User findById(String id) {
		return this.userRpository.findOne(id);
	}

	@Override
	public void delete(User user) {
		this.userRpository.delete(user);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Page<User> findAll(int page, int size) {
		Pageable pageable = new PageRequest(page, size);
		return this.userRpository.findAll(pageable);
	}
}
