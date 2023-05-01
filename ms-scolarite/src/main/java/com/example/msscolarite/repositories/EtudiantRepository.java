package com.example.msscolarite.repositories;

import com.example.msscolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantByIdFormation(Long idf);

}