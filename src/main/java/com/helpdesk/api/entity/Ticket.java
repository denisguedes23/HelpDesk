package com.helpdesk.api.entity;

import java.awt.List;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.helpdesk.api.enums.ProfileEnum;
import com.helpdesk.api.enums.StatusEnum;

@Document
public class Ticket {
	
	@Id
	private String id;
	
	@DBRef(lazy = true)
	private User user;

	private Date date;
	
	private String title;
	
	private Integer number;
	
	private StatusEnum status;
	
	private ProfileEnum priority;
	
	@DBRef(lazy = true)
	private User assignedUser;
	
	private String description;
	
	private String image;
	
	private List changes;
}
