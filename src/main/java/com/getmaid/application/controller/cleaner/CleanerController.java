package com.getmaid.application.controller.cleaner;

import java.util.UUID;

import org.springframework.stereotype.Controller;

import com.getmaid.application.dto.cleaner.CleanerDTO;
import com.getmaid.application.exception.NotFoundException;
import com.getmaid.application.persistence.cleaner.CleanerRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CleanerController {
    private final CleanerRepository cleanerRepository;

    public void createCleaner(CleanerDTO cleaner) {
        cleanerRepository.save(cleaner.toDomain());
    }

    public CleanerDTO findCleanerById(UUID id) {
        var cleaner = cleanerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cleaner " + id + " not found."));
        return CleanerDTO.fromDomain(cleaner);
    }
}
