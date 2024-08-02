package com.company.recruitment.wanted_pre_onboarding_backend.repository;

import com.company.recruitment.wanted_pre_onboarding_backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
