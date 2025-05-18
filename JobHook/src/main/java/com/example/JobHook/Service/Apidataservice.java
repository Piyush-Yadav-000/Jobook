package com.example.JobHook.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobHook.Repository.ApidataRepo;
import com.example.JobHook.entities.Apidata;

@Service
public class Apidataservice {

    @Autowired
    private ApidataRepo apidataRepo;

    // Get job by ID
    public Optional<Apidata> getApidataById(String id) {
        return apidataRepo.findById(id);
    }

    // Save new job data
    public Apidata saveApidata(Apidata apidata) {
        return apidataRepo.save(apidata);
    }


    }
