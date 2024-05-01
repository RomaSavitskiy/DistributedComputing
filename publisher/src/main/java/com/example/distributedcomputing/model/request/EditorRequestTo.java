package com.example.distributedcomputing.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record EditorRequestTo (
    Long id,
    @NotBlank
    @Size(min = 2, max = 64)
    String login,
    @NotBlank
    @Size(min = 8, max = 128)
    String password,
    @NotBlank
    @Size(min = 2, max = 64)
    String firstname,
    @NotBlank
    @Size(min = 2, max = 64)
    String lastname) {
}

