package com.jobportal.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.jobportal.jobportal.entity.Job;
import com.jobportal.jobportal.repository.JobRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository repo;

    // CREATE
    public Job save(Job job) {
        return repo.save(job);
    }

    // GET ALL
    public List<Job> getAllJobs() {
        return repo.findAll();
    }

    // GET BY ID
    public Job getJobById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // SEARCH BY TITLE
    public List<Job> searchByTitle(
            String title) {

        return repo.findByTitleContainingIgnoreCase(
                title
        );
    }

    // FILTER BY LOCATION
    public List<Job> searchByLocation(
            String location) {

        return repo.findByLocationContainingIgnoreCase(
                location
        );
    }

    // FILTER BY EXPERIENCE
    public List<Job> searchByExperience(
            String experience) {

        return repo.findByExperienceContainingIgnoreCase(
                experience
        );
    }

    // FILTER BY SALARY
    public List<Job> searchBySalary(
            String salary) {

        return repo.findBySalaryContainingIgnoreCase(
                salary
        );
    }

    // UPDATE
    public Job updateJob(Long id, Job job) {

        Job existing =
                repo.findById(id)
                        .orElse(null);

        if (existing != null) {

            existing.setTitle(job.getTitle());
            existing.setCompany(job.getCompany());
            existing.setLocation(job.getLocation());
            existing.setSalary(job.getSalary());
            existing.setExperience(job.getExperience());
            existing.setDescription(job.getDescription());

            return repo.save(existing);
        }

        return null;
    }

    // DELETE
    public void deleteJob(Long id) {
        repo.deleteById(id);
    }
}