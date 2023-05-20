package com.getmaid.application.dto.cleaner;

import java.util.List;
import java.util.UUID;

import com.getmaid.domain.cleaner.Cleaner;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CleanerDTO {
    private UUID id;
    private String email;
    private String phone;
    private List<String> habilities;

    public Cleaner toDomain() {
        return Cleaner.builder()
                .id(id)
                .email(email)
                .phone(phone)
                .habilities(habilities)
                .build();
    }
}
