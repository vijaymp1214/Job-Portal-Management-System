package com.jobportal.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobportal.entity.Application;
import com.jobportal.jobportal.repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    public Application apply(
            Application application) {

        return repository.save(application);
    }

    public List<Application> getAllApplications() {

        return repository.findAll();
    }

    // MY APPLICATIONS
    public List<Application> getMyApplications(
            String email) {

        return repository.findByApplicantEmail(
                email
        );
    }

    // UPDATE STATUS
    public Application updateStatus(
            Long id,
            String status) {

        Application application =
                repository.findById(id)
                        .orElse(null);

        if (application != null) {

            application.setStatus(status);

            return repository.save(application);
        }

        return null;
    }

    // TOTAL APPLICATIONS
    public long getApplicationsCount() {

        return repository.count();
    }

    // TOTAL SELECTED CANDIDATES
    public long getSelectedCount() {

        return repository.countByStatus(
                "Selected"
        );
    }
}