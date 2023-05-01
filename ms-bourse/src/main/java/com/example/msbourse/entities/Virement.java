package com.example.msbourse.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVirement;

    private Float montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVirement;

    @ManyToOne
    private Etudiant etudiant;
}
