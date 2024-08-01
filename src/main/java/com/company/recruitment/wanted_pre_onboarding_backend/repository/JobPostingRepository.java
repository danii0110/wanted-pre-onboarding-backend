package com.company.recruitment.wanted_pre_onboarding_backend.repository;

import com.company.recruitment.wanted_pre_onboarding_backend.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {
}
