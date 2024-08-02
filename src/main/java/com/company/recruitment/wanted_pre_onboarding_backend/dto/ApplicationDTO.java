package com.company.recruitment.wanted_pre_onboarding_backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class ApplicationDTO {
    private UUID id;
    private UUID userId;
    private UUID jobPostingId;
    private LocalDateTime applicationDate;
}
