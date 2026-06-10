package com.jobportal.jobportal.controller;

import com.jobportal.jobportal.entity.Job;
import com.jobportal.jobportal.service.JobService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "http://localhost:5173")
public class JobController {

    @Autowired
    private JobService service;

    // CREATE JOB
    @PostMapping
    public Job createJob(
            @Valid @RequestBody Job job) {

        return service.save(job);
    }

    // GET ALL JOBS
    @GetMapping
    public List<Job> getAllJobs() {

        return service.getAllJobs();
    }

    // SEARCH BY TITLE
    @GetMapping("/search/title")
    public List<Job> searchByTitle(
            @RequestParam String keyword) {

        return service.searchByTitle(
                keyword
        );
    }

    // FILTER BY LOCATION
    @GetMapping("/search/location")
    public List<Job> searchByLocation(
            @RequestParam String keyword) {

        return service.searchByLocation(
                keyword
        );
    }

    // FILTER BY EXPERIENCE
    @GetMapping("/search/experience")
    public List<Job> searchByExperience(
            @RequestParam String keyword) {

        return service.searchByExperience(
                keyword
        );
    }

    // FILTER BY SALARY
    @GetMapping("/search/salary")
    public List<Job> searchBySalary(
            @RequestParam String keyword) {

        return service.searchBySalary(
                keyword
        );
    }

    // GET JOB BY ID
    @GetMapping("/{id}")
    public Job getJob(
            @PathVariable Long id) {

        return service.getJobById(id);
    }

    // UPDATE JOB
    @PutMapping("/{id}")
    public Job updateJob(
            @PathVariable Long id,
            @Valid @RequestBody Job job) {

        return service.updateJob(
                id,
                job
        );
    }

    // DELETE JOB
    @DeleteMapping("/{id}")
    public String deleteJob(
            @PathVariable Long id) {

        service.deleteJob(id);

        return "Job deleted successfully";
    }
}