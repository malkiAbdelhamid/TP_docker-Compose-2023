package com.example.msformationmysql.repositories;

import com.example.msformationmysql.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}