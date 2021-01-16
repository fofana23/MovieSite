package com.fofana23.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.tools.javac.util.List;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class AccountHolder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private boolean loggedin;
	private String password;
	@OneToMany(mappedBy = "holder")
	private List<Account> accounts;
	
	
	public AccountHolder(Integer id, boolean loggedin, String password, com.fofana23.app.model.List<Account> accounts) {
		super();
		this.id = id;
		this.loggedin = loggedin;
		this.password = password;
		this.accounts = accounts;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public boolean isLoggedin() {
		return loggedin;
	}


	public void setLoggedin(boolean loggedin) {
		this.loggedin = loggedin;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
	
	
}
