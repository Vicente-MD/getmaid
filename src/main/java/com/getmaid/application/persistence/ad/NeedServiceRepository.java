package com.getmaid.application.persistence.ad;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getmaid.domain.ad.NeedService;

@Repository
public interface NeedServiceRepository extends JpaRepository<NeedService, UUID> {
    
}
