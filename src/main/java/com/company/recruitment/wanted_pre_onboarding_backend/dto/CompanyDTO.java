package com.company.recruitment.wanted_pre_onboarding_backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CompanyDTO {
    private UUID id;
    private String name;
    private String country;
    private String region;
}