package com.getmaid.application.persistence.academical;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getmaid.domain.academical.Academical;

@Repository
public interface AcademicalRepository extends JpaRepository<Academical, UUID> {
    
}
