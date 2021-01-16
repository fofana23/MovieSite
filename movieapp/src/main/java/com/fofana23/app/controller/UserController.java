package com.fofana23.app.controller;

import java.io.IOException;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fofana23.app.model.AccountHolder;
import com.fofana23.app.service.UserService;
import com.fofana23.app.transaction.Profile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
	
public class UserController {
	

	@Autowired
	UserService service;
	
	@PostMapping("register")
	public AccountHolder register(@RequestBody AccountHolder holder) throws IOException {
	
		return service.register(holder);
	}
	
	@PostMapping("login")
	public AccountHolder login(@RequestBody Profile profile) {
		return service.login(profile);
	}
	
	@PostMapping("logout")
	public AccountHolder logout(@RequestBody Profile profile) {

		return service.login(profile);
	}
	
	@PutMapping("edit")
	public AccountHolder editProfile(@RequestBody Profile profile) {

		return service.editProfile(profile);
	}

}
