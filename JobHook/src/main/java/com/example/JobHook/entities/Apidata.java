package com.example.JobHook.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Apidata {

    @Id
    @Column
    private String jobid;

    @Column
    private String title;

    @Column
    private String description;

    public Apidata() {}

    public Apidata(String jobid, String title, String description) {
        this.jobid = jobid;
        this.title = title;
        this.description = description;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Apidata [jobid=" + jobid + ", title=" + title + ", description=" + description + "]";
    }
}
