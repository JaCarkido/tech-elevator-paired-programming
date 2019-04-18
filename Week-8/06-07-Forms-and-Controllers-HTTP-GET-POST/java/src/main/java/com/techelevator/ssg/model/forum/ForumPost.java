package com.techelevator.ssg.model.forum;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ForumPost {
	private Long id;
	private String username;
	private String subject;
	private String message;
	private LocalDateTime datePosted;
	
	public ForumPost() {
		
	}
	
	public ForumPost(String username, String subject, String message) {
		this.username = username;
		this.subject = subject;
		this.message  = message;
		LocalDateTime now = LocalDateTime.now();
		datePosted = now;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(LocalDateTime datePosted) {
		this.datePosted = datePosted;
	}
}
