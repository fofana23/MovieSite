package com.fofana23.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fofana23.app.model.AccountHolder;
import com.fofana23.app.repository.AccountRepository;
import com.fofana23.app.transaction.Profile;

@Service
public class UserService {

	@Autowired
	AccountHolderRepository holderRepo;
	@Autowired
	AccountRepository accountRepo;
	
	public AccountHolder register(AccountHolder holder) {
	}
	public AccountHolder login(Profile profile) throws BusinessException {
		AccountHolder holder = holderRepo.findByEmail(profile.getEmail());
		
		if (holder == null) {
			throw new BusinessException("No accounts found with this email");
		} else if (!holder.getPassword().equals(profile.getPassword())) {
			throw new BusinessException("Invalid credentials");
		}
		holder.setLoggedin(true);
		return holderRepo.save(holder);
		}

	public AccountHolder editProfile(Profile profile) {
		log.info("user is editing account");
	    AccountHolder holder = holderRepo.findByEmail(profile.getEmail());
	    holder.setUsername(profile.getUsername());
	    holder.setEmail(profile.getEmail());
	    holder.setPassword(profile.getPassword());
	    return holderRepo.save(holder);
		}
		
	
}
