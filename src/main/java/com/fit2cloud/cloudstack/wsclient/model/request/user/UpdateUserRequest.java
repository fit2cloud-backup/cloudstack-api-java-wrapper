package com.fit2cloud.cloudstack.wsclient.model.request.user;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class UpdateUserRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String firstname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	private String lastname;
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String timezone;
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	private String userapikey;
	public String getUserapikey() {
		return userapikey;
	}
	public void setUserapikey(String userapikey) {
		this.userapikey = userapikey;
	}
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String usersecretkey;
	public String getUsersecretkey() {
		return usersecretkey;
	}
	public void setUsersecretkey(String usersecretkey) {
		this.usersecretkey = usersecretkey;
	}

}
