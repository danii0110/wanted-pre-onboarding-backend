package com.company.recruitment.wanted_pre_onboarding_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Entity
public class Application {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, columnDefinition = "CHAR(36)")
    private User user;

    @ManyToOne
    @JoinColumn(name = "job_posting_id", nullable = false, columnDefinition = "CHAR(36)")
    private JobPosting jobPosting;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime applicationDate;
}
