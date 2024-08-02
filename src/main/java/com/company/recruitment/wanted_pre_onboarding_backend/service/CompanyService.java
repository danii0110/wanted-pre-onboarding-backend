package com.company.recruitment.wanted_pre_onboarding_backend.service;

import com.company.recruitment.wanted_pre_onboarding_backend.dto.CompanyDTO;
import com.company.recruitment.wanted_pre_onboarding_backend.entity.Company;
import com.company.recruitment.wanted_pre_onboarding_backend.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository cRepo;

    public CompanyDTO createCompany(CompanyDTO companyDTO) {
        Company company = new Company(companyDTO.getName(), companyDTO.getCountry(), companyDTO.getRegion());
        Company savedCompany = cRepo.save(company);
        return convertToDTO(savedCompany);
    }

    public Optional<CompanyDTO> getCompanyById(UUID id) {
        return cRepo.findById(id).map(this::convertToDTO);
    }

    public List<CompanyDTO> getAllCompanies() {
        return cRepo.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public void deleteCompany(UUID id) {
        cRepo.deleteById(id);
    }

    private CompanyDTO convertToDTO(Company company) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setId(company.getId());
        companyDTO.setName(company.getName());
        companyDTO.setCountry(company.getCountry());
        companyDTO.setRegion(company.getRegion());
        return companyDTO;
    }
}
