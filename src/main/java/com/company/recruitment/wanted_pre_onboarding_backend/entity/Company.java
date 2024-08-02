package com.company.recruitment.wanted_pre_onboarding_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
public class Company {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String region;

    @OneToMany(mappedBy = "company")
    private List<JobPosting> jobPostings;

    public Company(String name, String country, String region) {
        this.name = name;
        this.country = country;
        this.region = region;
    }
}
