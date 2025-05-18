package com.example.JobHook.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobHook.Repository.UserRepo;
import com.example.JobHook.entities.Register;
import com.example.JobHook.requests.LoginRequest;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	public Register addUser(Register user) {
		return userRepo.save(user);
	}
	
	public Boolean loginUser(LoginRequest loginuser) {
		Optional<Register> user=userRepo.findById(loginuser.getEmail());
		if(user==null) {
			return false;
		}
		Register user1=user.get();
		if(!user1.getPassword().equals(loginuser.getPassword())) return false;
		
		return true;
	}
}
