package com.example.entity;

public class User{
	private String userId;
	private String password;
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
}