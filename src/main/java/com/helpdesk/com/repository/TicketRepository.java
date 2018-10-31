package com.helpdesk.com.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.helpdesk.com.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String>{

	Page<Ticket> findByUserIdOrderByDateDes(Pageable pages, String userId);
	
	Page<Ticket> findByTitle(String title, String status, String priority, Pageable pages);

	Page<Ticket> findByTitleUser(String title, String status, String priority, Pageable pages);
	
	Page<Ticket> findByTitleDate(String title, String status, String priority, Pageable pages);
	
	Page<Ticket> findNumber(Integer number, Pageable pages);
}
