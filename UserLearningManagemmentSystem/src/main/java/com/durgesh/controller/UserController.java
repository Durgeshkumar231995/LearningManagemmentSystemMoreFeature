package com.durgesh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgesh.model.User;
import com.durgesh.service.IUserService;

@RestController
@RequestMapping("/api/v1.0/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private IUserService userService;
	

	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user){
		
		
		User saveUser = userService.saveUser(user);
		
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
		
	}
	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<User> loginUser(@PathVariable String email,@PathVariable String password){
		
		
		User saveUser = userService.userLogin(email,password);
		
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
		
	}
	
}
