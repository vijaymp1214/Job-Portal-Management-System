package com.jobportal.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.jobportal.entity.CandidateProfile;
import com.jobportal.jobportal.repository.CandidateProfileRepository;

@Service
public class CandidateProfileService {

    @Autowired
    private CandidateProfileRepository repository;

    // SAVE PROFILE
    public CandidateProfile saveProfile(
            CandidateProfile profile) {

        return repository.save(profile);
    }

    // GET PROFILE BY EMAIL
    public CandidateProfile getProfileByEmail(
            String email) {

        return repository.findByEmail(email);
    }

    // UPDATE PROFILE
    public CandidateProfile updateProfile(
            Long id,
            CandidateProfile profile) {

        CandidateProfile existing =
                repository.findById(id)
                        .orElse(null);

        if (existing != null) {

            existing.setFullName(
                    profile.getFullName());

            existing.setMobileNumber(
                    profile.getMobileNumber());

            existing.setQualification(
                    profile.getQualification());

            existing.setSkills(
                    profile.getSkills());

            existing.setLocation(
                    profile.getLocation());

            existing.setAboutMe(
                    profile.getAboutMe());

            existing.setResumeLink(
                    profile.getResumeLink());

            existing.setProfilePhoto(
                    profile.getProfilePhoto());

            return repository.save(existing);
        }

        return null;
    }
}