package com.example.msbourse.model;

import lombok.Data;

import java.util.Date;

@Data
public class EtudiantScolarite {

    private String nom;

    private String promo;

    private Date dateInscription;

    private String nomEtablissement;
}
