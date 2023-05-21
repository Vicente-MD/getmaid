package com.getmaid.application.rest.academical;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getmaid.application.controller.academical.AcademicalController;
import com.getmaid.application.dto.academical.AcademicalDTO;

import lombok.RequiredArgsConstructor;

@RestController("/academical")
@RequiredArgsConstructor
public class AcademicalResource {
    private final AcademicalController academicalController;

    @PostMapping()
    public ResponseEntity<Void> createAcademical(@RequestBody AcademicalDTO cleaner) {
        academicalController.createAcademical(cleaner);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcademicalDTO> findAcademicalById(@PathVariable UUID id) {
        return ResponseEntity.ok(academicalController.findAcademicalById(id));
    }
}
