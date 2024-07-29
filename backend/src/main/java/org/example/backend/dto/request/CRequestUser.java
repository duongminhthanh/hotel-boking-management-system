package org.example.backend.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CRequestUser {
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
}
