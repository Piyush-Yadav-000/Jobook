package com.example.JobHook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobHook.entities.Register;
@Repository
public interface UserRepo extends JpaRepository<Register, String>{

	
}
