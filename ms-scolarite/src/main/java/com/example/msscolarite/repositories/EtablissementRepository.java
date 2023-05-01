package com.example.msscolarite.repositories;

import com.example.msscolarite.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
}