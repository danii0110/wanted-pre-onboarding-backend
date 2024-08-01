package com.company.recruitment.wanted_pre_onboarding_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String region;

    @OneToMany(mappedBy = "company")
    private List<JobPosting> jobPostings;
}
