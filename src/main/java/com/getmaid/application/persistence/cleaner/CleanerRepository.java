package com.getmaid.application.persistence.cleaner;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getmaid.domain.cleaner.Cleaner;

@Repository
public interface CleanerRepository extends JpaRepository<Cleaner, UUID> {
    
}
