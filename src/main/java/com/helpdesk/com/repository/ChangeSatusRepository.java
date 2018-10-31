package com.helpdesk.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.helpdesk.com.entity.ChangeStatus;

public interface ChangeSatusRepository extends MongoRepository<ChangeStatus, String>{
	
	Iterable<ChangeStatus> findByTicketOrderById(String ticketId);
}
