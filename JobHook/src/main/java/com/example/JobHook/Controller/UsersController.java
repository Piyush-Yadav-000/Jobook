package com.example.JobHook.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JobHook.Service.UserService;
import com.example.JobHook.entities.Register;
import com.example.JobHook.requests.LoginRequest;

@RestController
public class UsersController {
	
	@Autowired
  UserService userService;
	private LoginRequest loginuser;

	@PostMapping("/adduser")
	@CrossOrigin("*")
	public Register addUser(@RequestBody Register user) {
		return this.userService.addUser(user);
	}
	@PostMapping("/loginUser")
	@CrossOrigin("*")
	public Boolean LoginUser(@RequestBody LoginRequest loginuser) {
		return this.userService.loginUser(loginuser);
	}
}
