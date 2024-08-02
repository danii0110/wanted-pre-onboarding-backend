package com.company.recruitment.wanted_pre_onboarding_backend.controller;

import com.company.recruitment.wanted_pre_onboarding_backend.dto.CompanyDTO;
import com.company.recruitment.wanted_pre_onboarding_backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/companies")
public class CompanyController {
    @Autowired
    private CompanyService cSvc;

    @PostMapping
    public ResponseEntity<CompanyDTO> createCompany(@RequestBody CompanyDTO companyDTO) {
        CompanyDTO createdCompany = cSvc.createCompany(companyDTO);
        return ResponseEntity.ok(createdCompany);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getCompanyById(@PathVariable UUID id) {
        return cSvc.getCompanyById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<CompanyDTO> getAllCompanies() {
        return cSvc.getAllCompanies();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable UUID id) {
        cSvc.deleteCompany(id);
        return ResponseEntity.noContent().build();
    }
}
