package com.getmaid.application.controller.academical;

import java.util.UUID;

import org.springframework.stereotype.Controller;

import com.getmaid.application.dto.academical.AcademicalDTO;
import com.getmaid.application.exception.NotFoundException;
import com.getmaid.application.persistence.academical.AcademicalRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AcademicalController {
    private final AcademicalRepository academicalRepository;

    public void createAcademical(AcademicalDTO academicalDTO) {
        academicalRepository.save(academicalDTO.toDomain());
    }

    public AcademicalDTO findAcademicalById(UUID id) {
        var academical = academicalRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Academical " + id + " not found."));
        return AcademicalDTO.fromDomain(academical);
    }
}
