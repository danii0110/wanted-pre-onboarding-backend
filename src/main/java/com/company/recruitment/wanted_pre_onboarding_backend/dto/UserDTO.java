package com.company.recruitment.wanted_pre_onboarding_backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDTO {
    private UUID id;
    private String nickname;
    private String email;
}
