package com.jobportal.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.jobportal.entity.Job;

public interface JobRepository
        extends JpaRepository<Job, Long> {

    List<Job> findByTitleContainingIgnoreCase(
            String title
    );

    List<Job> findByLocationContainingIgnoreCase(
            String location
    );

    List<Job> findByExperienceContainingIgnoreCase(
            String experience
    );

    List<Job> findBySalaryContainingIgnoreCase(
            String salary
    );
}