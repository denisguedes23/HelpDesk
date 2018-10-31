package com.helpdesk.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.helpdesk.com.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

	User findOne(String id);
}
