package com.example.JobHook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobHook.entities.Apidata;
@Repository
public interface ApidataRepo extends JpaRepository<Apidata, String> {
}
