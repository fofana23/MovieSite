package com.fofana23.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;


@Entity
	@Table
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
	@SequenceGenerator(name = "sequence", initialValue = 1000000)
public class Account {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "sequence")
		private Integer id;
		private String username;
		private boolean credit;
		private Double balance;
		@ManyToOne
		private AccountHolder holder;
		
		
		public Account(Integer id, String username, boolean credit, Double balance, AccountHolder holder) {
			super();
			this.id = id;
			this.username = username;
			this.credit = credit;
			this.balance = balance;
			this.holder = holder;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public boolean isCredit() {
			return credit;
		}
		public void setCredit(boolean credit) {
			this.credit = credit;
		}
		public Double getBalance() {
			return balance;
		}
		public void setBalance(Double balance) {
			this.balance = balance;
		}
		public AccountHolder getHolder() {
			return holder;
		}
		public void setHolder(AccountHolder holder) {
			this.holder = holder;
		}
		
}
