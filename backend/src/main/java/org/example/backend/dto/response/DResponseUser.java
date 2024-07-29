package org.example.backend.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DResponseUser {
    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
}
