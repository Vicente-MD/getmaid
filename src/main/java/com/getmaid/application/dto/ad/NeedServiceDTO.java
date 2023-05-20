package com.getmaid.application.dto.ad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.getmaid.domain.academical.Academical;
import com.getmaid.domain.ad.NeedService;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NeedServiceDTO {
    private UUID id;
    private String idAcademical;
    private String description;
    private LocalDateTime createdDate;

    public NeedService toDomain() {
        return NeedService.builder()
                .id(id)
                .idAcademical(Academical.builder().id(id).build())
                .description(description)
                .createdDate(createdDate)
                .build();
    }
}
