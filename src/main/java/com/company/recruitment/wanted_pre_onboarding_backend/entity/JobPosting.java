package com.company.recruitment.wanted_pre_onboarding_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Entity
public class JobPosting {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false, columnDefinition = "CHAR(36)")
    private Company company;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private int reward;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String skills;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "jobPosting")
    private List<Application> applicationList;
}
