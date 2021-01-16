package com.fofana23.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fofana23.app.model.AccountHolder;

@Repository

public interface AccountHolderRespository extends JpaRepository<AccountHolder, Integer> {

	public AccountHolder findById(String Id);
}
