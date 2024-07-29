package com.company.recruitment.wanted_pre_onboarding_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "job_posting_id", nullable = false)
    private JobPosting jobPosting;

    @Column(nullable = false, updatable = false)
    private LocalDateTime applicationDate;

    @PrePersist
    protected void onCreate() {
        this.applicationDate = LocalDateTime.now();
    }
}
