package com.getmaid.application.rest.cleaner;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getmaid.application.controller.cleaner.CleanerController;
import com.getmaid.application.dto.cleaner.CleanerDTO;

import lombok.RequiredArgsConstructor;

@RestController("/cleaner")
@RequiredArgsConstructor
public class CleanerResource {
    private final CleanerController cleanerController;

    @PostMapping()
    public ResponseEntity<Void> createCleaner(@RequestBody CleanerDTO cleaner) {
        cleanerController.createCleaner(cleaner);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CleanerDTO> findCleanerById(@PathVariable UUID id) {
        return ResponseEntity.ok(cleanerController.findCleanerById(id));
    }

}
