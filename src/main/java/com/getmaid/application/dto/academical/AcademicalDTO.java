package com.getmaid.application.dto.academical;

import java.util.UUID;

import com.getmaid.domain.academical.Academical;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AcademicalDTO {
    private UUID id;
    private UUID name;
    private double email;
    private String phone;

    public Academical toDomain() {
        return Academical.builder()
            .id(id)
            .name(name)
            .email(email)
            .phone(phone).build();
    }
}
