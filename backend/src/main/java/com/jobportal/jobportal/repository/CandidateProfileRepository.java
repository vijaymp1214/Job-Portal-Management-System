package com.jobportal.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.jobportal.entity.CandidateProfile;

public interface CandidateProfileRepository
        extends JpaRepository<CandidateProfile, Long> {

    CandidateProfile findByEmail(String email);

}