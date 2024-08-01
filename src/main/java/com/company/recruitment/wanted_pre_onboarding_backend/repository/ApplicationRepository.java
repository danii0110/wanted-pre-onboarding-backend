package com.company.recruitment.wanted_pre_onboarding_backend.repository;

import com.company.recruitment.wanted_pre_onboarding_backend.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
