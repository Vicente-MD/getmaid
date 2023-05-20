package com.getmaid.domain.ad;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import com.getmaid.domain.cleaner.Cleaner;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class OfferService {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    private Cleaner idCleaner;
    private double valuePerDay;
    private String description;
    @CreatedDate
    private LocalDateTime createdDate;
}
