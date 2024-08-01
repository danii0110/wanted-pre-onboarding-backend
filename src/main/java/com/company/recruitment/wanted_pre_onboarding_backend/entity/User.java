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
public class User {
    // 유저 아이디의 보안을 위해서 UUID 사용, mysql과 호환을 위해 columnDefinition을 CHAR(36)으로 해줌
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private UUID id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, unique = true)
    private String email;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "user")
    private List<Application> applicationList;
}
