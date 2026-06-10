package com.jobportal.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jobportal.jobportal.entity.Application;
import com.jobportal.jobportal.service.ApplicationService;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "http://localhost:5173")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping
    public Application apply(
            @RequestBody Application application) {

        return service.apply(application);
    }

    @GetMapping
    public List<Application> getAll() {

        return service.getAllApplications();
    }

    // MY APPLICATIONS
    @GetMapping("/my/{email}")
    public List<Application> getMyApplications(
            @PathVariable String email) {

        return service.getMyApplications(
                email
        );
    }

    // TOTAL APPLICATIONS COUNT
    @GetMapping("/count")
    public long getApplicationsCount() {

        return service.getApplicationsCount();
    }

    // SELECTED CANDIDATES COUNT
    @GetMapping("/selected-count")
    public long getSelectedCount() {

        return service.getSelectedCount();
    }

    // SELECT CANDIDATE
    @PutMapping("/{id}/select")
    public Application selectCandidate(
            @PathVariable Long id) {

        return service.updateStatus(
                id,
                "Selected"
        );
    }

    // REJECT CANDIDATE
    @PutMapping("/{id}/reject")
    public Application rejectCandidate(
            @PathVariable Long id) {

        return service.updateStatus(
                id,
                "Rejected"
        );
    }
}