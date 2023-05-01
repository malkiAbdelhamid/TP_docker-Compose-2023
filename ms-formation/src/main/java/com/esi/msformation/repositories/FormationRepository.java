package com.esi.msformation.repositories;

import com.esi.msformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}