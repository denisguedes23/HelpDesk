package com.helpdesk.com.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.helpdesk.com.enums.PrioriryEnum;
import com.helpdesk.com.enums.StatusEnum;

public class Ticket {

	@Id
	private String id;
	
	@DBRef(lazy = true)
	private User user;
	
	private Date data;
	
	private String title;
	
	private Integer number;
	
	private StatusEnum status;
	
	private PrioriryEnum priority;
	
	@DBRef(lazy = true)
	private User assignedUser;
	
	private String description;
	
	private String image;
	
	@Transient
	private List<ChangeStatus> changes;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public PrioriryEnum getPriority() {
		return priority;
	}

	public void setPriority(PrioriryEnum priority) {
		this.priority = priority;
	}

	public User getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(User assignedUser) {
		this.assignedUser = assignedUser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<ChangeStatus> getChanges() {
		return changes;
	}

	public void setChanges(List<ChangeStatus> changes) {
		this.changes = changes;
	}
	
}
