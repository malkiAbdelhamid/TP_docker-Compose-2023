package com.example.msformationmysql.api;



import com.example.msformationmysql.entities.Formation;
import com.example.msformationmysql.proxy.EtudiantProxy;
import com.example.msformationmysql.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
public class FormationAPI {

    @Autowired
    FormationRepository formationRepository;

    @Autowired
    EtudiantProxy etudiantProxy;

    @GetMapping("/formations/{id}")
    Formation getFOrmationWIthEtudiants(@PathVariable("id") Long id)
    {
        Formation formation=formationRepository.findById(id).get();

        formation.setEtudiants(new ArrayList(etudiantProxy.getLesEtudiants(id,"toformation").getContent()));

        return formation;
    }
}
