package com.company.recruitment.wanted_pre_onboarding_backend.dto;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class UserDTO {
    private UUID id;
    private String nickname;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
