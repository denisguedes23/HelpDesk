package com.helpdesk.com.entity;

import java.util.Date;

import com.helpdesk.com.enums.StatusEnum;

public class ChangeStatus {

	private String id;
	
	private Ticket ticket;
	
	private User userChange;
	
	private Date dataChangeStatus;
	
	private StatusEnum status;

	public ChangeStatus() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChange() {
		return userChange;
	}

	public void setUserChange(User userChange) {
		this.userChange = userChange;
	}

	public Date getDataChangeStatus() {
		return dataChangeStatus;
	}

	public void setDataChangeStatus(Date dataChangeStatus) {
		this.dataChangeStatus = dataChangeStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
}
