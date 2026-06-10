package com.jobportal.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.jobportal.entity.Application;

public interface ApplicationRepository
        extends JpaRepository<Application, Long> {

    long countByStatus(String status);

    List<Application> findByApplicantEmail(
            String applicantEmail
    );
}