package com.example.msscolarite.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="tobourse", types = {Etudiant.class})
public interface EtudiantProjectionB {

    public String getNom();
    public String getPromo();
    public Date getDateInscription();

    @Value("#{target.etablissement.nom}")
    public String getNomEtablissement();
}
