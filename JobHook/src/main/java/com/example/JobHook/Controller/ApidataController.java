package com.example.JobHook.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.JobHook.Service.Apidataservice;
import com.example.JobHook.entities.Apidata;

@RestController
@RequestMapping("/apidata")
public class ApidataController {

    @Autowired
    private Apidataservice apidataservice;

    // GET job by ID
    @GetMapping("/{jobid}")
    public Optional<Apidata> getApidata(@PathVariable("jobid") String jobid) {
        return apidataservice.getApidataById(jobid);
    }

    // POST new job
    @PostMapping("/create")
    public Apidata createApidata(@RequestBody Apidata apidata) {
        return apidataservice.saveApidata(apidata);
    }
}