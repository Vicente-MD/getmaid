package com.getmaid.application.dto.ad;

import java.time.LocalDateTime;
import java.util.UUID;

import com.getmaid.domain.ad.OfferService;
import com.getmaid.domain.cleaner.Cleaner;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfferServiceDTO {
    private UUID id;
    private String idCleaner;
    private double valuePerDay;
    private String description;
    private LocalDateTime createdDate;

    public OfferService toDomain() {
        return OfferService.builder()
                .id(id)
                .idCleaner(Cleaner.builder().id(id).build())
                .valuePerDay(valuePerDay)
                .description(description)
                .createdDate(createdDate)
                .build();
    }
}
