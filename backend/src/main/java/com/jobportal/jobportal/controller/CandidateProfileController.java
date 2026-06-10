package com.jobportal.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jobportal.jobportal.entity.CandidateProfile;
import com.jobportal.jobportal.service.CandidateProfileService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/profile")
@CrossOrigin(origins = "http://localhost:5173")
public class CandidateProfileController {

    @Autowired
    private CandidateProfileService service;

    // SAVE PROFILE
    @PostMapping
    public CandidateProfile saveProfile(
            @Valid @RequestBody CandidateProfile profile) {

        return service.saveProfile(profile);
    }

    // GET PROFILE BY EMAIL
    @GetMapping("/{email}")
    public CandidateProfile getProfile(
            @PathVariable String email) {

        return service.getProfileByEmail(email);
    }

    // UPDATE PROFILE
    @PutMapping("/{id}")
    public CandidateProfile updateProfile(
            @PathVariable Long id,
            @Valid @RequestBody CandidateProfile profile) {

        return service.updateProfile(id, profile);
    }
}