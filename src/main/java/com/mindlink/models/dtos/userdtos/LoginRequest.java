package com.mindlink.models.dtos.userdtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

public record LoginRequest(
        @Email
        @NotBlank
        String email,

        @NotBlank
        String password
) {}
