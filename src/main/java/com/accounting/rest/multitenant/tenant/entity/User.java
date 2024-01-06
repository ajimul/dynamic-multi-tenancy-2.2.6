package com.accounting.rest.multitenant.tenant.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(nullable = false, unique = true)
	private String userName;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	private Boolean active;

	private String clientId;

	private String dbName;

	private String roles;

	@Column(nullable = false)
	private String status;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String userName, String email, String password, Boolean active, String clientId,
			String dbName, String roles, String status) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.active = active;
		this.clientId = clientId;
		this.dbName = dbName;
		this.roles = roles;
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Boolean getActive() {
		return active;
	}

	public String getClientId() {
		return clientId;
	}

	public String getDbName() {
		return dbName;
	}

	public String getRoles() {
		return roles;
	}

	public String getStatus() {
		return status;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
